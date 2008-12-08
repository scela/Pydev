// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class Lambda extends exprType {
    public argumentsType args;
    public exprType body;

    public Lambda(argumentsType args, exprType body) {
        this.args = args;
        this.body = body;
    }

    public Lambda(argumentsType args, exprType body, SimpleNode parent) {
        this(args, body);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Lambda[");
        sb.append("args=");
        sb.append(dumpThis(this.args));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(34, ostream);
        pickleThis(this.args, ostream);
        pickleThis(this.body, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitLambda(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null)
            args.accept(visitor);
        if (body != null)
            body.accept(visitor);
    }

}
