import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_project_membership200_response import GetProjectMembership200Response  # noqa: E501
from openapi_server.models.get_project_memberships_for_project200_response import GetProjectMembershipsForProject200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectMembershipsController(BaseTestCase):
    """ProjectMembershipsController integration test stubs"""

    def test_get_project_membership(self):
        """Test case for get_project_membership

        Get a project membership
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/project_memberships/{project_membership_gid}'.format(project_membership_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_memberships_for_project(self):
        """Test case for get_project_memberships_for_project

        Get memberships from a project
        """
        query_string = [('user', 'me'),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/project_memberships'.format(project_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
