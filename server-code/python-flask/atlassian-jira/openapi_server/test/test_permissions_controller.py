import unittest

from flask import json

from openapi_server.models.bulk_permission_grants import BulkPermissionGrants  # noqa: E501
from openapi_server.models.bulk_permissions_request_bean import BulkPermissionsRequestBean  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.permissions import Permissions  # noqa: E501
from openapi_server.models.permissions_keys_bean import PermissionsKeysBean  # noqa: E501
from openapi_server.models.permitted_projects import PermittedProjects  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPermissionsController(BaseTestCase):
    """PermissionsController integration test stubs"""

    def test_get_all_permissions(self):
        """Test case for get_all_permissions

        Get all permissions
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissions',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bulk_permissions(self):
        """Test case for get_bulk_permissions

        Get bulk permissions
        """
        bulk_permissions_request_bean = {"accountId":"accountId","globalPermissions":["globalPermissions","globalPermissions"],"projectPermissions":[{"projects":[6,6],"permissions":["permissions","permissions"],"issues":[0,0]},{"projects":[6,6],"permissions":["permissions","permissions"],"issues":[0,0]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissions/check',
            method='POST',
            headers=headers,
            data=json.dumps(bulk_permissions_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_my_permissions(self):
        """Test case for get_my_permissions

        Get my permissions
        """
        query_string = [('projectKey', 'project_key_example'),
                        ('projectId', 'project_id_example'),
                        ('issueKey', 'issue_key_example'),
                        ('issueId', 'issue_id_example'),
                        ('permissions', 'BROWSE_PROJECTS,EDIT_ISSUES'),
                        ('projectUuid', 'project_uuid_example'),
                        ('projectConfigurationUuid', 'project_configuration_uuid_example'),
                        ('commentId', 'comment_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/mypermissions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_permitted_projects(self):
        """Test case for get_permitted_projects

        Get permitted projects
        """
        permissions_keys_bean = {"permissions":["permissions","permissions"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/permissions/project',
            method='POST',
            headers=headers,
            data=json.dumps(permissions_keys_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
