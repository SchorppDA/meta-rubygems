from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_aws_sdk_shield(RubyGemsTestUtils):

    def test_gem_list_rubygems_aws_sdk_shield(self):
        self.gem_is_installed("aws-sdk-shield")

    def test_load_aws_sdk_shield(self):
        self.gem_is_loadable("aws-sdk-shield")

