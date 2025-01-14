// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs : global::Pulumi.ResourceArgs
    {
        [Input("statements", required: true)]
        private InputList<Inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>? _statements;

        /// <summary>
        /// Statements to combine with `AND` logic. You can use any statements that can be nested. See `statement` above for details.
        /// </summary>
        public InputList<Inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs> Statements
        {
            get => _statements ?? (_statements = new InputList<Inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementArgs>());
            set => _statements = value;
        }

        public WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs()
        {
        }
        public static new WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs Empty => new WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementArgs();
    }
}
