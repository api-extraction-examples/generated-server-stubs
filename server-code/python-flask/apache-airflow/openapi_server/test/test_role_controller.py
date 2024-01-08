import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.role import Role  # noqa: E501
from openapi_server.models.role_collection import RoleCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRoleController(BaseTestCase):
    """RoleController integration test stubs"""

    def test_delete_role(self):
        """Test case for delete_role

        Delete a role
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/roles/{role_name}'.format(role_name='role_name_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_role(self):
        """Test case for get_role

        Get a role
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/roles/{role_name}'.format(role_name='role_name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_roles(self):
        """Test case for get_roles

        List roles
        """
        query_string = [('limit', 100),
                        ('offset', 56),
                        ('order_by', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/roles',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_role(self):
        """Test case for patch_role

        Update a role
        """
        role = {"name":"name","actions":[{"resource":{"name":"name"},"action":{"name":"name"}},{"resource":{"name":"name"},"action":{"name":"name"}}]}
        query_string = [('update_mask', ['update_mask_example'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/roles/{role_name}'.format(role_name='role_name_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(role),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_role(self):
        """Test case for post_role

        Create a role
        """
        role = {"name":"name","actions":[{"resource":{"name":"name"},"action":{"name":"name"}},{"resource":{"name":"name"},"action":{"name":"name"}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/roles',
            method='POST',
            headers=headers,
            data=json.dumps(role),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
