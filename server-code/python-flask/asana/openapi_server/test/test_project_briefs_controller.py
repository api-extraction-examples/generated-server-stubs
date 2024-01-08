import unittest

from flask import json

from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_project_brief200_response import GetProjectBrief200Response  # noqa: E501
from openapi_server.models.update_project_brief_request import UpdateProjectBriefRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectBriefsController(BaseTestCase):
    """ProjectBriefsController integration test stubs"""

    def test_create_project_brief(self):
        """Test case for create_project_brief

        Create a project brief
        """
        update_project_brief_request = openapi_server.UpdateProjectBriefRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/project_briefs'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(update_project_brief_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_brief(self):
        """Test case for delete_project_brief

        Delete a project brief
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_briefs/{project_brief_gid}'.format(project_brief_gid='12345'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_brief(self):
        """Test case for get_project_brief

        Get a project brief
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_briefs/{project_brief_gid}'.format(project_brief_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project_brief(self):
        """Test case for update_project_brief

        Update a project brief
        """
        update_project_brief_request = openapi_server.UpdateProjectBriefRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_briefs/{project_brief_gid}'.format(project_brief_gid='12345'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_project_brief_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
