public class LiteralExpression implements Expression {
    CompoundExpression _parent;
    @Override
    public CompoundExpression getParent() {
        return _parent;
    }

    @Override
    public void setParent(CompoundExpression parent) {
        _parent=parent;
    }

    @Override
    public Expression deepCopy() {
        return null;
    }

    @Override
    public void flatten() {

    }

    @Override
    public void convertToString(StringBuilder stringBuilder, int indentLevel) {
        System.out.print();
    }
}
