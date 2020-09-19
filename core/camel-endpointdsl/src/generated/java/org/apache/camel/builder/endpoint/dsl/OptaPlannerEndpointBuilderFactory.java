/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Solve planning problems with OptaPlanner.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface OptaPlannerEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the OptaPlanner component.
     */
    public interface OptaPlannerEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedOptaPlannerEndpointConsumerBuilder advanced() {
            return (AdvancedOptaPlannerEndpointConsumerBuilder) this;
        }
        /**
         * In case of using SolverManager : the problem id.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Default: 1L
         * Group: common
         */
        default OptaPlannerEndpointConsumerBuilder problemId(Long problemId) {
            doSetProperty("problemId", problemId);
            return this;
        }
        /**
         * In case of using SolverManager : the problem id.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Default: 1L
         * Group: common
         */
        default OptaPlannerEndpointConsumerBuilder problemId(String problemId) {
            doSetProperty("problemId", problemId);
            return this;
        }
        /**
         * Specifies the solverId to user for the solver instance key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: DEFAULT_SOLVER
         * Group: common
         */
        default OptaPlannerEndpointConsumerBuilder solverId(String solverId) {
            doSetProperty("solverId", solverId);
            return this;
        }
        /**
         * use SolverManager instead of XML file config. Use this mode on
         * Quarkus app.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default OptaPlannerEndpointConsumerBuilder useSolverManager(
                boolean useSolverManager) {
            doSetProperty("useSolverManager", useSolverManager);
            return this;
        }
        /**
         * use SolverManager instead of XML file config. Use this mode on
         * Quarkus app.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default OptaPlannerEndpointConsumerBuilder useSolverManager(
                String useSolverManager) {
            doSetProperty("useSolverManager", useSolverManager);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default OptaPlannerEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default OptaPlannerEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the OptaPlanner component.
     */
    public interface AdvancedOptaPlannerEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default OptaPlannerEndpointConsumerBuilder basic() {
            return (OptaPlannerEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the OptaPlanner component.
     */
    public interface OptaPlannerEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedOptaPlannerEndpointProducerBuilder advanced() {
            return (AdvancedOptaPlannerEndpointProducerBuilder) this;
        }
        /**
         * In case of using SolverManager : the problem id.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Default: 1L
         * Group: common
         */
        default OptaPlannerEndpointProducerBuilder problemId(Long problemId) {
            doSetProperty("problemId", problemId);
            return this;
        }
        /**
         * In case of using SolverManager : the problem id.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Default: 1L
         * Group: common
         */
        default OptaPlannerEndpointProducerBuilder problemId(String problemId) {
            doSetProperty("problemId", problemId);
            return this;
        }
        /**
         * Specifies the solverId to user for the solver instance key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: DEFAULT_SOLVER
         * Group: common
         */
        default OptaPlannerEndpointProducerBuilder solverId(String solverId) {
            doSetProperty("solverId", solverId);
            return this;
        }
        /**
         * use SolverManager instead of XML file config. Use this mode on
         * Quarkus app.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default OptaPlannerEndpointProducerBuilder useSolverManager(
                boolean useSolverManager) {
            doSetProperty("useSolverManager", useSolverManager);
            return this;
        }
        /**
         * use SolverManager instead of XML file config. Use this mode on
         * Quarkus app.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default OptaPlannerEndpointProducerBuilder useSolverManager(
                String useSolverManager) {
            doSetProperty("useSolverManager", useSolverManager);
            return this;
        }
        /**
         * Specifies to perform operations in async mode.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default OptaPlannerEndpointProducerBuilder async(boolean async) {
            doSetProperty("async", async);
            return this;
        }
        /**
         * Specifies to perform operations in async mode.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default OptaPlannerEndpointProducerBuilder async(String async) {
            doSetProperty("async", async);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default OptaPlannerEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default OptaPlannerEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Specifies the thread pool size to use when async is true.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10
         * Group: producer
         */
        default OptaPlannerEndpointProducerBuilder threadPoolSize(
                int threadPoolSize) {
            doSetProperty("threadPoolSize", threadPoolSize);
            return this;
        }
        /**
         * Specifies the thread pool size to use when async is true.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 10
         * Group: producer
         */
        default OptaPlannerEndpointProducerBuilder threadPoolSize(
                String threadPoolSize) {
            doSetProperty("threadPoolSize", threadPoolSize);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the OptaPlanner component.
     */
    public interface AdvancedOptaPlannerEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default OptaPlannerEndpointProducerBuilder basic() {
            return (OptaPlannerEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the OptaPlanner component.
     */
    public interface OptaPlannerEndpointBuilder
            extends
                OptaPlannerEndpointConsumerBuilder,
                OptaPlannerEndpointProducerBuilder {
        default AdvancedOptaPlannerEndpointBuilder advanced() {
            return (AdvancedOptaPlannerEndpointBuilder) this;
        }
        /**
         * In case of using SolverManager : the problem id.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Default: 1L
         * Group: common
         */
        default OptaPlannerEndpointBuilder problemId(Long problemId) {
            doSetProperty("problemId", problemId);
            return this;
        }
        /**
         * In case of using SolverManager : the problem id.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Default: 1L
         * Group: common
         */
        default OptaPlannerEndpointBuilder problemId(String problemId) {
            doSetProperty("problemId", problemId);
            return this;
        }
        /**
         * Specifies the solverId to user for the solver instance key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: DEFAULT_SOLVER
         * Group: common
         */
        default OptaPlannerEndpointBuilder solverId(String solverId) {
            doSetProperty("solverId", solverId);
            return this;
        }
        /**
         * use SolverManager instead of XML file config. Use this mode on
         * Quarkus app.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default OptaPlannerEndpointBuilder useSolverManager(
                boolean useSolverManager) {
            doSetProperty("useSolverManager", useSolverManager);
            return this;
        }
        /**
         * use SolverManager instead of XML file config. Use this mode on
         * Quarkus app.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default OptaPlannerEndpointBuilder useSolverManager(
                String useSolverManager) {
            doSetProperty("useSolverManager", useSolverManager);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OptaPlanner component.
     */
    public interface AdvancedOptaPlannerEndpointBuilder
            extends
                AdvancedOptaPlannerEndpointConsumerBuilder,
                AdvancedOptaPlannerEndpointProducerBuilder {
        default OptaPlannerEndpointBuilder basic() {
            return (OptaPlannerEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedOptaPlannerEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface OptaPlannerBuilders {
        /**
         * OptaPlanner (camel-optaplanner)
         * Solve planning problems with OptaPlanner.
         * 
         * Category: engine,planning
         * Since: 2.13
         * Maven coordinates: org.apache.camel:camel-optaplanner
         * 
         * Syntax: <code>optaplanner:configFile</code>
         * 
         * Path parameter: configFile (required)
         * Specifies the location to the solver file. If useSolverManager=FALSE,
         * Camel uses this file and create the Solver. If useSolverManager=TRUE
         * and SolverManager is set in the header
         * {OptaPlannerConstants.SOLVER_MANAGER} : this file is ignored by Camel
         * usage of SolverManager. SolverManager can be injected by DI in
         * Quarkus or Spring.
         * 
         * @param path configFile
         */
        default OptaPlannerEndpointBuilder optaplanner(String path) {
            return OptaPlannerEndpointBuilderFactory.endpointBuilder("optaplanner", path);
        }
        /**
         * OptaPlanner (camel-optaplanner)
         * Solve planning problems with OptaPlanner.
         * 
         * Category: engine,planning
         * Since: 2.13
         * Maven coordinates: org.apache.camel:camel-optaplanner
         * 
         * Syntax: <code>optaplanner:configFile</code>
         * 
         * Path parameter: configFile (required)
         * Specifies the location to the solver file. If useSolverManager=FALSE,
         * Camel uses this file and create the Solver. If useSolverManager=TRUE
         * and SolverManager is set in the header
         * {OptaPlannerConstants.SOLVER_MANAGER} : this file is ignored by Camel
         * usage of SolverManager. SolverManager can be injected by DI in
         * Quarkus or Spring.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path configFile
         */
        default OptaPlannerEndpointBuilder optaplanner(
                String componentName,
                String path) {
            return OptaPlannerEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static OptaPlannerEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class OptaPlannerEndpointBuilderImpl extends AbstractEndpointBuilder implements OptaPlannerEndpointBuilder, AdvancedOptaPlannerEndpointBuilder {
            public OptaPlannerEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new OptaPlannerEndpointBuilderImpl(path);
    }
}