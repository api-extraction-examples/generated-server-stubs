import unittest

from flask import json

from openapi_server.models.application_role import ApplicationRole  # noqa: E501
from openapi_server.test import BaseTestCase


class TestApplicationRolesController(BaseTestCase):
    """ApplicationRolesController integration test stubs"""

    def test_get_all_application_roles(self):
        """Test case for get_all_application_roles

        Get all application roles
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/applicationrole',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_application_role(self):
        """Test case for get_application_role

        Get application role
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/applicationrole/{key}'.format(key='jira-software'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
