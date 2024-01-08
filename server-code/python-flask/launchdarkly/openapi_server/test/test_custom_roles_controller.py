import unittest

from flask import json

from openapi_server.models.custom_role import CustomRole  # noqa: E501
from openapi_server.models.custom_roles import CustomRoles  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_custom_role_request import PostCustomRoleRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomRolesController(BaseTestCase):
    """CustomRolesController integration test stubs"""

    def test_delete_custom_role(self):
        """Test case for delete_custom_role

        Delete a custom role by key.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/roles/{custom_role_key}'.format(custom_role_key='custom_role_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_role(self):
        """Test case for get_custom_role

        Get one custom role by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/roles/{custom_role_key}'.format(custom_role_key='custom_role_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_roles(self):
        """Test case for get_custom_roles

        Return a complete list of custom roles.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/roles',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_custom_role(self):
        """Test case for patch_custom_role

        Modify a custom role by key.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/roles/{custom_role_key}'.format(custom_role_key='custom_role_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_custom_role(self):
        """Test case for post_custom_role

        Create a new custom role.
        """
        custom_role_body = openapi_server.PostCustomRoleRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/roles',
            method='POST',
            headers=headers,
            data=json.dumps(custom_role_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
