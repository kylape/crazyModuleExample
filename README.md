#WS Module Example for EAP 6

Two JBoss Modules:

- `com.redhat.gss.sei`
- `com.redhat.gss.param`

You'll have to manually contruct the modules from the two sub projects.

`sei` depends on `param`, but the .war does not depend on `param`.

You can run `mvn jboss-as:deploy` in the `endpoint` module to deploy it.
