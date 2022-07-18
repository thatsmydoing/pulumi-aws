// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassifierCsvClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassifierCsvClassifierArgs Empty = new ClassifierCsvClassifierArgs();

    /**
     * Enables the processing of files that contain only one column.
     * 
     */
    @Import(name="allowSingleColumn")
    private @Nullable Output<Boolean> allowSingleColumn;

    /**
     * @return Enables the processing of files that contain only one column.
     * 
     */
    public Optional<Output<Boolean>> allowSingleColumn() {
        return Optional.ofNullable(this.allowSingleColumn);
    }

    /**
     * Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
     * 
     */
    @Import(name="containsHeader")
    private @Nullable Output<String> containsHeader;

    /**
     * @return Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
     * 
     */
    public Optional<Output<String>> containsHeader() {
        return Optional.ofNullable(this.containsHeader);
    }

    /**
     * The delimiter used in the Csv to separate columns.
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    /**
     * @return The delimiter used in the Csv to separate columns.
     * 
     */
    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * Specifies whether to trim column values.
     * 
     */
    @Import(name="disableValueTrimming")
    private @Nullable Output<Boolean> disableValueTrimming;

    /**
     * @return Specifies whether to trim column values.
     * 
     */
    public Optional<Output<Boolean>> disableValueTrimming() {
        return Optional.ofNullable(this.disableValueTrimming);
    }

    /**
     * A list of strings representing column names.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    /**
     * @return A list of strings representing column names.
     * 
     */
    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
     * 
     */
    @Import(name="quoteSymbol")
    private @Nullable Output<String> quoteSymbol;

    /**
     * @return A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
     * 
     */
    public Optional<Output<String>> quoteSymbol() {
        return Optional.ofNullable(this.quoteSymbol);
    }

    private ClassifierCsvClassifierArgs() {}

    private ClassifierCsvClassifierArgs(ClassifierCsvClassifierArgs $) {
        this.allowSingleColumn = $.allowSingleColumn;
        this.containsHeader = $.containsHeader;
        this.delimiter = $.delimiter;
        this.disableValueTrimming = $.disableValueTrimming;
        this.headers = $.headers;
        this.quoteSymbol = $.quoteSymbol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassifierCsvClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassifierCsvClassifierArgs $;

        public Builder() {
            $ = new ClassifierCsvClassifierArgs();
        }

        public Builder(ClassifierCsvClassifierArgs defaults) {
            $ = new ClassifierCsvClassifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowSingleColumn Enables the processing of files that contain only one column.
         * 
         * @return builder
         * 
         */
        public Builder allowSingleColumn(@Nullable Output<Boolean> allowSingleColumn) {
            $.allowSingleColumn = allowSingleColumn;
            return this;
        }

        /**
         * @param allowSingleColumn Enables the processing of files that contain only one column.
         * 
         * @return builder
         * 
         */
        public Builder allowSingleColumn(Boolean allowSingleColumn) {
            return allowSingleColumn(Output.of(allowSingleColumn));
        }

        /**
         * @param containsHeader Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
         * 
         * @return builder
         * 
         */
        public Builder containsHeader(@Nullable Output<String> containsHeader) {
            $.containsHeader = containsHeader;
            return this;
        }

        /**
         * @param containsHeader Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
         * 
         * @return builder
         * 
         */
        public Builder containsHeader(String containsHeader) {
            return containsHeader(Output.of(containsHeader));
        }

        /**
         * @param delimiter The delimiter used in the Csv to separate columns.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        /**
         * @param delimiter The delimiter used in the Csv to separate columns.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        /**
         * @param disableValueTrimming Specifies whether to trim column values.
         * 
         * @return builder
         * 
         */
        public Builder disableValueTrimming(@Nullable Output<Boolean> disableValueTrimming) {
            $.disableValueTrimming = disableValueTrimming;
            return this;
        }

        /**
         * @param disableValueTrimming Specifies whether to trim column values.
         * 
         * @return builder
         * 
         */
        public Builder disableValueTrimming(Boolean disableValueTrimming) {
            return disableValueTrimming(Output.of(disableValueTrimming));
        }

        /**
         * @param headers A list of strings representing column names.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers A list of strings representing column names.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers A list of strings representing column names.
         * 
         * @return builder
         * 
         */
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param quoteSymbol A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
         * 
         * @return builder
         * 
         */
        public Builder quoteSymbol(@Nullable Output<String> quoteSymbol) {
            $.quoteSymbol = quoteSymbol;
            return this;
        }

        /**
         * @param quoteSymbol A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
         * 
         * @return builder
         * 
         */
        public Builder quoteSymbol(String quoteSymbol) {
            return quoteSymbol(Output.of(quoteSymbol));
        }

        public ClassifierCsvClassifierArgs build() {
            return $;
        }
    }

}