// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class DictComp extends exprType {
    public exprType key;
    public exprType value;
    public comprehensionType[] generators;

    public DictComp(exprType key, exprType value, comprehensionType[]
    generators) {
        this.key = key;
        this.value = value;
        this.generators = generators;
    }

    public DictComp(exprType key, exprType value, comprehensionType[]
    generators, SimpleNode parent) {
        this(key, value, generators);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("DictComp[");
        sb.append("key=");
        sb.append(dumpThis(this.key));
        sb.append(", ");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append(", ");
        sb.append("generators=");
        sb.append(dumpThis(this.generators));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(40, ostream);
        pickleThis(this.key, ostream);
        pickleThis(this.value, ostream);
        pickleThis(this.generators, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitDictComp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (key != null)
            key.accept(visitor);
        if (value != null)
            value.accept(visitor);
        if (generators != null) {
            for (int i = 0; i < generators.length; i++) {
                if (generators[i] != null)
                    generators[i].accept(visitor);
            }
        }
    }

}
