import unittest

from flask import json

from openapi_server.models.workflow_transition_property import WorkflowTransitionProperty  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowTransitionPropertiesController(BaseTestCase):
    """WorkflowTransitionPropertiesController integration test stubs"""

    def test_create_workflow_transition_property(self):
        """Test case for create_workflow_transition_property

        Create workflow transition property
        """
        workflow_transition_property = {"id":"id","value":"value","key":"key"}
        query_string = [('key', 'key_example'),
                        ('workflowName', 'workflow_name_example'),
                        ('workflowMode', 'live')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/transitions/{transition_id}/properties'.format(transition_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(workflow_transition_property),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_workflow_transition_property(self):
        """Test case for delete_workflow_transition_property

        Delete workflow transition property
        """
        query_string = [('key', 'key_example'),
                        ('workflowName', 'workflow_name_example'),
                        ('workflowMode', 'workflow_mode_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/transitions/{transition_id}/properties'.format(transition_id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_transition_properties(self):
        """Test case for get_workflow_transition_properties

        Get workflow transition properties
        """
        query_string = [('includeReservedKeys', False),
                        ('key', 'key_example'),
                        ('workflowName', 'workflow_name_example'),
                        ('workflowMode', 'live')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/transitions/{transition_id}/properties'.format(transition_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_workflow_transition_property(self):
        """Test case for update_workflow_transition_property

        Update workflow transition property
        """
        workflow_transition_property = {"id":"id","value":"value","key":"key"}
        query_string = [('key', 'key_example'),
                        ('workflowName', 'workflow_name_example'),
                        ('workflowMode', 'workflow_mode_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/transitions/{transition_id}/properties'.format(transition_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(workflow_transition_property),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
