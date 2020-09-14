/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Workflows API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>=============== WorkflowsClient ===============
 *
 * <p>Service Description: Workflows is used to deploy and execute workflow programs. Workflows
 * makes sure the program executes reliably, despite hardware and networking interruptions.
 *
 * <p>Sample for WorkflowsClient:
 *
 * <pre>
 * <code>
 * try (WorkflowsClient workflowsClient = WorkflowsClient.create()) {
 *   WorkflowName name = WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]");
 *   Workflow response = workflowsClient.getWorkflow(name);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.workflows.v1beta;

import javax.annotation.Generated;
