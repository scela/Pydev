// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class Set extends exprType {
    public exprType[] elts;

    public Set(exprType[] elts) {
        this.elts = elts;
    }

    public Set(exprType[] elts, SimpleNode parent) {
        this(elts);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Set[");
        sb.append("elts=");
        sb.append(dumpThis(this.elts));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(37, ostream);
        pickleThis(this.elts, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitSet(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elts != null) {
            for (int i = 0; i < elts.length; i++) {
                if (elts[i] != null)
                    elts[i].accept(visitor);
            }
        }
    }

}
