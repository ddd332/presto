/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.cli;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import static com.facebook.presto.cli.AlignedTuplePrinter.formatValue;
import static com.facebook.presto.cli.AlignedTuplePrinter.maxLineLength;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.repeat;
import static java.lang.Math.max;

public class VerticalTuplePrinter
        implements OutputPrinter
{
    private static final Splitter LINE_SPLITTER = Splitter.on('\n');

    private final List<String> fieldNames;
    private final int namesWidth;
    private final Writer writer;

    private long rowCount;

    public VerticalTuplePrinter(List<String> fieldNames, Writer writer)
    {
        this.fieldNames = ImmutableList.copyOf(checkNotNull(fieldNames, "fieldNames is null"));
        this.namesWidth = maxWidth(fieldNames);
        this.writer = checkNotNull(writer, "writer is null");
    }

    @Override
    public void finish()
            throws IOException
    {
        if (rowCount == 0) {
            writer.append("(no rows)\n");
        }
        writer.flush();
    }

    @Override
    public void printRows(List<List<?>> rows, boolean complete)
            throws IOException
    {
        int valuesWidth = 0;
        for (List<?> row : rows) {
            for (Object o : row) {
                valuesWidth = max(valuesWidth, maxLineLength(formatValue(o)));
            }
        }

        for (List<?> row : rows) {
            rowCount++;

            String header = "-[ RECORD " + rowCount + " ]";
            if ((namesWidth + 1) >= header.length()) {
                header += repeat("-", (namesWidth + 1) - header.length()) + "+";
            }
            header += repeat("-", max(0, (namesWidth + valuesWidth + 3) - header.length()));
            writer.append(header).append('\n');

            for (int i = 0; i < row.size(); i++) {
                String name = fieldNames.get(i);
                String column = formatValue(row.get(i));
                for (String line : LINE_SPLITTER.split(column)) {
                    writer.append(name)
                            .append(repeat(" ", namesWidth - name.length()))
                            .append(" | ")
                            .append(formatValue(line))
                            .append("\n");
                    name = repeat(" ", name.length());
                }
            }
        }
    }

    private static int maxWidth(Iterable<String> strings)
    {
        int n = 0;
        for (String s : strings) {
            n = max(n, s.length());
        }
        return n;
    }
}
