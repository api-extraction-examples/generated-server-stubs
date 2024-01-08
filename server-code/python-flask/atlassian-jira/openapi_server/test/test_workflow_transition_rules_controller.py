import unittest

from flask import json

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_workflow_transition_rules import PageBeanWorkflowTransitionRules  # noqa: E501
from openapi_server.models.workflow_transition_rules_update import WorkflowTransitionRulesUpdate  # noqa: E501
from openapi_server.models.workflow_transition_rules_update_errors import WorkflowTransitionRulesUpdateErrors  # noqa: E501
from openapi_server.models.workflows_with_transition_rules_details import WorkflowsWithTransitionRulesDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowTransitionRulesController(BaseTestCase):
    """WorkflowTransitionRulesController integration test stubs"""

    def test_delete_workflow_transition_rule_configurations(self):
        """Test case for delete_workflow_transition_rule_configurations

        Delete workflow transition rule configurations
        """
        workflows_with_transition_rules_details = {"workflows":[{"workflowRuleIds":["workflowRuleIds","workflowRuleIds"],"workflowId":{"draft":True,"name":"name"}},{"workflowRuleIds":["workflowRuleIds","workflowRuleIds"],"workflowId":{"draft":True,"name":"name"}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/rule/config/delete',
            method='PUT',
            headers=headers,
            data=json.dumps(workflows_with_transition_rules_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_transition_rule_configurations(self):
        """Test case for get_workflow_transition_rule_configurations

        Get workflow transition rule configurations
        """
        query_string = [('startAt', 0),
                        ('maxResults', 10),
                        ('types', ['types_example']),
                        ('keys', ['keys_example']),
                        ('workflowNames', ['workflow_names_example']),
                        ('withTags', ['with_tags_example']),
                        ('draft', True),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/rule/config',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_workflow_transition_rule_configurations(self):
        """Test case for update_workflow_transition_rule_configurations

        Update workflow transition rule configurations
        """
        workflow_transition_rules_update = {"workflows":[{"postFunctions":[{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""},{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""}],"validators":[{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""},{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""}],"conditions":[{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""},{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""}],"workflowId":{"draft":True,"name":"name"}},{"postFunctions":[{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""},{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""}],"validators":[{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""},{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""}],"conditions":[{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""},{"configuration":{"disabled":False,"tag":"tag","value":"value"},"id":"id","key":"key","transition":""}],"workflowId":{"draft":True,"name":"name"}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/rule/config',
            method='PUT',
            headers=headers,
            data=json.dumps(workflow_transition_rules_update),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
