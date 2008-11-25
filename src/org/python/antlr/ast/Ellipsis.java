// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.AstAdapters;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ellipsis extends sliceType {

    public Ellipsis(Token token) {
        super(token);
    }

    public Ellipsis(Integer ttype, Token token) {
        super(ttype, token);
    }

    public Ellipsis(PythonTree tree) {
        super(tree);
    }

    public String toString() {
        return "Ellipsis";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Ellipsis(");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitEllipsis(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}
