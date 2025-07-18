from rubygems_utils import RubyGemsTestUtils

class RubyGemsTestrubygems_wisper(RubyGemsTestUtils):

    def test_exec_console(self):
        self.gem_exec_wrapper("console")

    def test_exec_console_lock(self):
        self.gem_exec_wrapper("console.lock")

    def test_exec_setup(self):
        self.gem_exec_wrapper("setup")

    def test_exec_setup_lock(self):
        self.gem_exec_wrapper("setup.lock")

    def test_gem_list_rubygems_wisper(self):
        self.gem_is_installed("wisper")

    def test_load_wisper(self):
        self.gem_is_loadable("wisper")

