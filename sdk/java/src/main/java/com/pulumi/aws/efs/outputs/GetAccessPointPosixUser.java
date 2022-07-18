// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessPointPosixUser {
    /**
     * @return Group ID
     * 
     */
    private final Integer gid;
    /**
     * @return Secondary group IDs
     * 
     */
    private final List<Integer> secondaryGids;
    /**
     * @return User Id
     * * `root_directory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
     * 
     */
    private final Integer uid;

    @CustomType.Constructor
    private GetAccessPointPosixUser(
        @CustomType.Parameter("gid") Integer gid,
        @CustomType.Parameter("secondaryGids") List<Integer> secondaryGids,
        @CustomType.Parameter("uid") Integer uid) {
        this.gid = gid;
        this.secondaryGids = secondaryGids;
        this.uid = uid;
    }

    /**
     * @return Group ID
     * 
     */
    public Integer gid() {
        return this.gid;
    }
    /**
     * @return Secondary group IDs
     * 
     */
    public List<Integer> secondaryGids() {
        return this.secondaryGids;
    }
    /**
     * @return User Id
     * * `root_directory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
     * 
     */
    public Integer uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointPosixUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer gid;
        private List<Integer> secondaryGids;
        private Integer uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointPosixUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.secondaryGids = defaults.secondaryGids;
    	      this.uid = defaults.uid;
        }

        public Builder gid(Integer gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }
        public Builder secondaryGids(List<Integer> secondaryGids) {
            this.secondaryGids = Objects.requireNonNull(secondaryGids);
            return this;
        }
        public Builder secondaryGids(Integer... secondaryGids) {
            return secondaryGids(List.of(secondaryGids));
        }
        public Builder uid(Integer uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public GetAccessPointPosixUser build() {
            return new GetAccessPointPosixUser(gid, secondaryGids, uid);
        }
    }
}