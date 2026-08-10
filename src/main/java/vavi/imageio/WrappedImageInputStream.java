/*
 * Copyright (c) 2022 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.imageio;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.stream.ImageInputStream;


/**
 * WrappedImageInputStream.
 *
 * Adapts a {@link ImageInputStream} to a standard {@link InputStream}.
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (umjammer)
 * @version 0.00 2022-09-07 umjammer initial version <br>
 */
public class WrappedImageInputStream extends InputStream {

    private final ImageInputStream iis;

    public WrappedImageInputStream(ImageInputStream iis) {
        this.iis = iis;
    }

    @Override
    public int read() throws IOException {
        return iis.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return iis.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        long skipped = 0;
        while (skipped < n) {
            int r = iis.read();
            if (r < 0) break;
            skipped++;
        }
        return skipped;
    }

    @Override
    public int available() throws IOException {
        return (int) Math.min(iis.length() - iis.getStreamPosition(), Integer.MAX_VALUE);
    }
}
