package io.quarkus.micrometer.runtime.config.runtime;

import java.util.Map;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

/**
 * Runtime configuration for Micrometer meter registries.
 */
@SuppressWarnings("unused")
@ConfigRoot(name = "micrometer.export", phase = ConfigPhase.RUN_TIME)
public class ExportConfig {
    // @formatter:off
    /**
     * Prometheus registry configuration properties.
     *
     * A property source for configuration of the Prometheus MeterRegistry,
     * see https://micrometer.io/docs/registry/prometheus.
     *
     * @asciidoclet
     */
    // @formatter:on
    @ConfigItem
    Map<String, String> prometheus;
}
