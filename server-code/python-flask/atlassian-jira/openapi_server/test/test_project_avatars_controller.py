import unittest

from flask import json

from openapi_server.models.avatar import Avatar  # noqa: E501
from openapi_server.models.project_avatars import ProjectAvatars  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectAvatarsController(BaseTestCase):
    """ProjectAvatarsController integration test stubs"""

    @unittest.skip("*/* not supported by Connexion. Use application/json instead. See https://github.com/zalando/connexion/pull/760")
    def test_create_project_avatar(self):
        """Test case for create_project_avatar

        Load project avatar
        """
        body = None
        query_string = [('x', 0),
                        ('y', 0),
                        ('size', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/avatar2'.format(project_id_or_key='project_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_avatar(self):
        """Test case for delete_project_avatar

        Delete project avatar
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/avatar/{id}'.format(project_id_or_key='project_id_or_key_example', id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_project_avatars(self):
        """Test case for get_all_project_avatars

        Get all project avatars
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/avatars'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project_avatar(self):
        """Test case for update_project_avatar

        Set project avatar
        """
        avatar = {"isDeletable":True,"owner":"owner","fileName":"fileName","urls":{"key":"https://openapi-generator.tech"},"isSelected":True,"isSystemAvatar":True,"id":"id"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/avatar'.format(project_id_or_key='project_id_or_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(avatar),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
