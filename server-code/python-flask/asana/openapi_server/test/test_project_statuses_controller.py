import unittest

from flask import json

from openapi_server.models.create_project_status_for_project_request import CreateProjectStatusForProjectRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_project_status200_response import GetProjectStatus200Response  # noqa: E501
from openapi_server.models.get_project_statuses_for_project200_response import GetProjectStatusesForProject200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectStatusesController(BaseTestCase):
    """ProjectStatusesController integration test stubs"""

    def test_create_project_status_for_project(self):
        """Test case for create_project_status_for_project

        Create a project status
        """
        create_project_status_for_project_request = openapi_server.CreateProjectStatusForProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/project_statuses'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(create_project_status_for_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_status(self):
        """Test case for delete_project_status

        Delete a project status
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_statuses/{project_status_gid}'.format(project_status_gid='321654'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_status(self):
        """Test case for get_project_status

        Get a project status
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_statuses/{project_status_gid}'.format(project_status_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_statuses_for_project(self):
        """Test case for get_project_statuses_for_project

        Get statuses from a project
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/project_statuses'.format(project_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
