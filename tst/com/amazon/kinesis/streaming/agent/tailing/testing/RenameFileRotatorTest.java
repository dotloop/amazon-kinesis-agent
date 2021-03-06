/*
 * Copyright (c) 2014-2017 Amazon.com, Inc. All Rights Reserved.
 */
package com.amazon.kinesis.streaming.agent.tailing.testing;

import java.nio.file.Path;

/**
 * Unit tests for {@link RenameFileRotator}.
 */
public class RenameFileRotatorTest extends FileRotatorTestBase {

    @Override
    protected FileRotator getFileRotator(Path root, String prefix) {
        return new RenameFileRotator(root, prefix);
    }

}