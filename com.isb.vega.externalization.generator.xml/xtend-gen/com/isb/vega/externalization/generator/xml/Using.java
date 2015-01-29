package com.isb.vega.externalization.generator.xml;

import com.google.common.base.Objects;
import java.io.Writer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class Using {
  public static <T extends Writer, R extends Object> R using(final T resource, final Function1<? super T,? extends R> proc) {
    try {
      Throwable mainThrowable = null;
      try {
        return proc.apply(resource);
      } catch (final Throwable _t) {
        if (_t instanceof Throwable) {
          final Throwable t = (Throwable)_t;
          mainThrowable = t;
          throw t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        boolean _equals = Objects.equal(mainThrowable, null);
        if (_equals) {
          resource.close();
        } else {
          try {
            resource.close();
          } catch (final Throwable _t_1) {
            if (_t_1 instanceof Throwable) {
              final Throwable unused = (Throwable)_t_1;
            } else {
              throw Exceptions.sneakyThrow(_t_1);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
