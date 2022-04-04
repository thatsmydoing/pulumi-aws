// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Backup.Outputs
{

    [OutputType]
    public sealed class ReportPlanReportSetting
    {
        /// <summary>
        /// Specifies the Amazon Resource Names (ARNs) of the frameworks a report covers.
        /// </summary>
        public readonly ImmutableArray<string> FrameworkArns;
        /// <summary>
        /// Specifies the number of frameworks a report covers.
        /// </summary>
        public readonly int? NumberOfFrameworks;
        /// <summary>
        /// Identifies the report template for the report. Reports are built using a report template. The report templates are: `RESOURCE_COMPLIANCE_REPORT` | `CONTROL_COMPLIANCE_REPORT` | `BACKUP_JOB_REPORT` | `COPY_JOB_REPORT` | `RESTORE_JOB_REPORT`.
        /// </summary>
        public readonly string ReportTemplate;

        [OutputConstructor]
        private ReportPlanReportSetting(
            ImmutableArray<string> frameworkArns,

            int? numberOfFrameworks,

            string reportTemplate)
        {
            FrameworkArns = frameworkArns;
            NumberOfFrameworks = numberOfFrameworks;
            ReportTemplate = reportTemplate;
        }
    }
}