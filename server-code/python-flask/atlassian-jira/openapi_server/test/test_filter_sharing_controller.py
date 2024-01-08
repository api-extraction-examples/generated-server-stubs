import unittest

from flask import json

from openapi_server.models.default_share_scope import DefaultShareScope  # noqa: E501
from openapi_server.models.share_permission import SharePermission  # noqa: E501
from openapi_server.models.share_permission_input_bean import SharePermissionInputBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFilterSharingController(BaseTestCase):
    """FilterSharingController integration test stubs"""

    def test_add_share_permission(self):
        """Test case for add_share_permission

        Add share permission
        """
        share_permission_input_bean = {"accountId":"accountId","groupId":"groupId","rights":0,"type":"user","groupname":"groupname","projectId":"projectId","projectRoleId":"projectRoleId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/permission'.format(id=56),
            method='POST',
            headers=headers,
            data=json.dumps(share_permission_input_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_share_permission(self):
        """Test case for delete_share_permission

        Delete share permission
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/permission/{permission_id}'.format(id=56, permission_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_default_share_scope(self):
        """Test case for get_default_share_scope

        Get default share scope
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/defaultShareScope',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_share_permission(self):
        """Test case for get_share_permission

        Get share permission
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/permission/{permission_id}'.format(id=56, permission_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_share_permissions(self):
        """Test case for get_share_permissions

        Get share permissions
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/permission'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_default_share_scope(self):
        """Test case for set_default_share_scope

        Set default share scope
        """
        default_share_scope = {"scope":"GLOBAL"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/defaultShareScope',
            method='PUT',
            headers=headers,
            data=json.dumps(default_share_scope),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
