(function (_, Kotlin, $module$escape_html) {
  'use strict';
  function main$lambda(req, res) {
    return res.send(createMessage(req));
  }
  function main() {
    exports.helloHttp = main$lambda;
  }
  function createMessage(req) {
    var tmp$;
    if (req.query.name !== undefined)
      tmp$ = $module$escape_html(req.query.name);
    else if (req.body.name !== undefined)
      tmp$ = $module$escape_html(req.body.name);
    else
      tmp$ = 'World';
    var message = tmp$;
    return 'Hello ' + message;
  }
  _.main = main;
  main();
  Kotlin.defineModule('kotlin-js-cloud-functions', _);
  return _;
}(module.exports, require('kotlin'), require('escape-html')));

//# sourceMappingURL=kotlin-js-cloud-functions.js.map
