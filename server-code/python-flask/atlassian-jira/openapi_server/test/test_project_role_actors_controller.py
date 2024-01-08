import unittest

from flask import json

from openapi_server.models.actor_input_bean import ActorInputBean  # noqa: E501
from openapi_server.models.actors_map import ActorsMap  # noqa: E501
from openapi_server.models.project_role import ProjectRole  # noqa: E501
from openapi_server.models.project_role_actors_update_bean import ProjectRoleActorsUpdateBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectRoleActorsController(BaseTestCase):
    """ProjectRoleActorsController integration test stubs"""

    def test_add_actor_users(self):
        """Test case for add_actor_users

        Add actors to project role
        """
        actors_map = {"groupId":["groupId","groupId"],"user":["user","user"],"group":["group","group"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/role/{id}'.format(project_id_or_key='project_id_or_key_example', id=56),
            method='POST',
            headers=headers,
            data=json.dumps(actors_map),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_project_role_actors_to_role(self):
        """Test case for add_project_role_actors_to_role

        Add default actors to project role
        """
        actor_input_bean = {"groupId":["groupId","groupId"],"user":["user","user"],"group":["group","group"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}/actors'.format(id=56),
            method='POST',
            headers=headers,
            data=json.dumps(actor_input_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_actor(self):
        """Test case for delete_actor

        Delete actors from project role
        """
        query_string = [('user', '5b10ac8d82e05b22cc7d4ef5'),
                        ('group', 'group_example'),
                        ('groupId', 'group_id_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/role/{id}'.format(project_id_or_key='project_id_or_key_example', id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_role_actors_from_role(self):
        """Test case for delete_project_role_actors_from_role

        Delete default actors from project role
        """
        query_string = [('user', '5b10ac8d82e05b22cc7d4ef5'),
                        ('groupId', 'group_id_example'),
                        ('group', 'group_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}/actors'.format(id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_role_actors_for_role(self):
        """Test case for get_project_role_actors_for_role

        Get default actors for project role
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}/actors'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_actors(self):
        """Test case for set_actors

        Set actors for project role
        """
        project_role_actors_update_bean = {"categorisedActors":{"key":["categorisedActors","categorisedActors"]},"id":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/role/{id}'.format(project_id_or_key='project_id_or_key_example', id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(project_role_actors_update_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
