SUMMARY = "package group for all rubygems"

inherit packagegroup

RDEPENDS_${PN} += "\
    rubygems-activemodel \
    rubygems-activesupport \
    rubygems-addressable \
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
    rubygems-bcrypt-pbkdf \
    rubygems-builder \
    rubygems-chef \
    rubygems-chef-config \
    rubygems-chef-telemetry \
    rubygems-chef-utils \
    rubygems-chef-vault \
    rubygems-chef-zero \
    rubygems-coderay \
    rubygems-concurrent-ruby \
    rubygems-deep-merge \
    rubygems-diff-lcs \
    rubygems-ed25519 \
    rubygems-erubi \
    rubygems-erubis \
    rubygems-facter \
    rubygems-faraday \
    rubygems-faraday-middleware \
    rubygems-faraday-net-http \
    rubygems-fast-gettext \
    rubygems-ffi \
    rubygems-ffi-libarchive \
    rubygems-ffi-yajl \
    rubygems-fuzzyurl \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-hashie \
    rubygems-hiera \
    rubygems-highline \
    rubygems-hocon \
    rubygems-httpclient \
    rubygems-i18n \
    rubygems-iniparse \
    rubygems-inspec-core \
    rubygems-ipaddress \
    rubygems-jmespath \
    rubygems-json \
    rubygems-libyajl2 \
    rubygems-license-acceptance \
    rubygems-little-plugger \
    rubygems-locale \
    rubygems-logging \
    rubygems-method-source \
    rubygems-mime-types \
    rubygems-mime-types-data \
    rubygems-mini-portile2 \
    rubygems-minitest \
    rubygems-mixlib-archive \
    rubygems-mixlib-authentication \
    rubygems-mixlib-cli \
    rubygems-mixlib-config \
    rubygems-mixlib-log \
    rubygems-mixlib-shellout \
    rubygems-multi-json \
    rubygems-multipart-post \
    rubygems-net-netconf \
    rubygems-net-scp \
    rubygems-net-sftp \
    rubygems-net-ssh \
    rubygems-net-ssh-gateway \
    rubygems-net-ssh-multi \
    rubygems-nokogiri \
    rubygems-nori \
    rubygems-ohai \
    rubygems-parallel \
    rubygems-parslet \
    rubygems-pastel \
    rubygems-plist \
    rubygems-proxifier \
    rubygems-pry \
    rubygems-public-suffix \
    rubygems-puppet \
    rubygems-puppet-resource-api \
    rubygems-puppetmodule-netdev-stdlib \
    rubygems-rack \
    rubygems-rspec \
    rubygems-rspec-core \
    rubygems-rspec-expectations \
    rubygems-rspec-its \
    rubygems-rspec-junit-formatter \
    rubygems-rspec-mocks \
    rubygems-rspec-support \
    rubygems-ruby2-keywords \
    rubygems-rubyntlm \
    rubygems-rubyzip \
    rubygems-scanf \
    rubygems-semantic-puppet \
    rubygems-semverse \
    rubygems-serverspec \
    rubygems-sfl \
    rubygems-slop \
    rubygems-specinfra \
    rubygems-sslshake \
    rubygems-strings \
    rubygems-strings-ansi \
    rubygems-syslog-logger \
    rubygems-systemu \
    rubygems-thor \
    rubygems-thread-safe \
    rubygems-tilt \
    rubygems-tomlrb \
    rubygems-train-core \
    rubygems-train-winrm \
    rubygems-tty-box \
    rubygems-tty-color \
    rubygems-tty-cursor \
    rubygems-tty-prompt \
    rubygems-tty-reader \
    rubygems-tty-screen \
    rubygems-tty-table \
    rubygems-tzinfo \
"
