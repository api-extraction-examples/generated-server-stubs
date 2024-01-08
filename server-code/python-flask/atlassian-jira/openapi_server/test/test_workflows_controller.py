import unittest

from flask import json

from openapi_server.models.create_workflow_details import CreateWorkflowDetails  # noqa: E501
from openapi_server.models.deprecated_workflow import DeprecatedWorkflow  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_workflow import PageBeanWorkflow  # noqa: E501
from openapi_server.models.workflow_ids import WorkflowIDs  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowsController(BaseTestCase):
    """WorkflowsController integration test stubs"""

    def test_create_workflow(self):
        """Test case for create_workflow

        Create workflow
        """
        create_workflow_details = {"name":"name","description":"description","statuses":[{"id":"id","properties":{"key":"properties"}},{"id":"id","properties":{"key":"properties"}}],"transitions":[{"name":"name","description":"description","screen":"","from":["from","from"],"rules":"","to":"to","type":"global","properties":{"key":"properties"}},{"name":"name","description":"description","screen":"","from":["from","from"],"rules":"","to":"to","type":"global","properties":{"key":"properties"}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow',
            method='POST',
            headers=headers,
            data=json.dumps(create_workflow_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_inactive_workflow(self):
        """Test case for delete_inactive_workflow

        Delete inactive workflow
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/{entity_id}'.format(entity_id='entity_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_workflows(self):
        """Test case for get_all_workflows

        Get all workflows
        """
        query_string = [('workflowName', 'workflow_name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflows_paginated(self):
        """Test case for get_workflows_paginated

        Get workflows paginated
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('workflowName', ['workflow_name_example']),
                        ('expand', 'expand_example'),
                        ('queryString', 'query_string_example'),
                        ('orderBy', 'order_by_example'),
                        ('isActive', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflow/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
