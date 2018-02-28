package org.springframework.security.saml.metadata;

import org.joda.time.DateTime;
import org.opensaml.saml.saml2.metadata.provider.FilesystemMetadataProvider;
import net.shibboleth.utilities.java.support.resolver.ResolverException;

import java.io.File;
import java.util.Timer;

/**
 * Provider which constantly refreshes itself.
 */
public class TestingFilesystemMetadataProvider extends FilesystemMetadataProvider {

    public TestingFilesystemMetadataProvider(File metadata) throws ResolverException {
        super(metadata);
    }

    public TestingFilesystemMetadataProvider(Timer backgroundTaskTimer, File metadata) throws ResolverException {
        super(backgroundTaskTimer, metadata);
    }

    @Override
    public DateTime getLastRefresh() {
        return null;
    }

}
