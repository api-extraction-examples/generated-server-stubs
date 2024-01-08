import unittest

from flask import json

from openapi_server.models.permission_grant import PermissionGrant  # noqa: E501
from openapi_server.models.permission_grants import PermissionGrants  # noqa: E501
from openapi_server.models.permission_scheme import PermissionScheme  # noqa: E501
from openapi_server.models.permission_schemes import PermissionSchemes  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPermissionSchemesController(BaseTestCase):
    """PermissionSchemesController integration test stubs"""

    def test_create_permission_grant(self):
        """Test case for create_permission_grant

        Create permission grant
        """
        permission_grant = {"self":"https://openapi-generator.tech","holder":"","permission":"permission","id":6}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}/permission'.format(scheme_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(permission_grant),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_permission_scheme(self):
        """Test case for create_permission_scheme

        Create permission scheme
        """
        permission_scheme = {"expand":"expand","permissions":[{"self":"https://openapi-generator.tech","holder":"","permission":"permission","id":6},{"self":"https://openapi-generator.tech","holder":"","permission":"permission","id":6}],"scope":"","name":"name","description":"description","self":"https://openapi-generator.tech","id":0}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme',
            method='POST',
            headers=headers,
            data=json.dumps(permission_scheme),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_permission_scheme(self):
        """Test case for delete_permission_scheme

        Delete permission scheme
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}'.format(scheme_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_permission_scheme_entity(self):
        """Test case for delete_permission_scheme_entity

        Delete permission scheme grant
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}/permission/{permission_id}'.format(scheme_id=56, permission_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_permission_schemes(self):
        """Test case for get_all_permission_schemes

        Get all permission schemes
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_permission_scheme(self):
        """Test case for get_permission_scheme

        Get permission scheme
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}'.format(scheme_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_permission_scheme_grant(self):
        """Test case for get_permission_scheme_grant

        Get permission scheme grant
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}/permission/{permission_id}'.format(scheme_id=56, permission_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_permission_scheme_grants(self):
        """Test case for get_permission_scheme_grants

        Get permission scheme grants
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}/permission'.format(scheme_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_permission_scheme(self):
        """Test case for update_permission_scheme

        Update permission scheme
        """
        permission_scheme = {"expand":"expand","permissions":[{"self":"https://openapi-generator.tech","holder":"","permission":"permission","id":6},{"self":"https://openapi-generator.tech","holder":"","permission":"permission","id":6}],"scope":"","name":"name","description":"description","self":"https://openapi-generator.tech","id":0}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissionscheme/{scheme_id}'.format(scheme_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(permission_scheme),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
