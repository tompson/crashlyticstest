## Sample project for crashlytics build problem

I noticed that since the `crashlytics-maven` was added to the build the HTML files of `assets/html` are not available anymore in a WebView via `file:///android_asset/html/index.html`.

It seems like this plugin is incompatible with the `com.google.code.maven-replacer-plugin` - if I disable either the resource filtering and replacing or the crashlytics plugin the HTML files are available again.
