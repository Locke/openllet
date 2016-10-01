package openllet.aterm.pure.owl;

import openllet.aterm.pure.PureFactory;

public class FunTransitive extends AFunOwl
{
	public FunTransitive(final PureFactory factory)
	{
		super(factory);
	}

	@Override
	public int getArity()
	{
		return 1;
	}
}
