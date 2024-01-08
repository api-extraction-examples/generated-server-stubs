import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.game_center_enabled_version_compatible_versions_linkages_request import GameCenterEnabledVersionCompatibleVersionsLinkagesRequest  # noqa: E501
from openapi_server.models.game_center_enabled_version_compatible_versions_linkages_response import GameCenterEnabledVersionCompatibleVersionsLinkagesResponse  # noqa: E501
from openapi_server.models.game_center_enabled_versions_response import GameCenterEnabledVersionsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGameCenterEnabledVersionsController(BaseTestCase):
    """GameCenterEnabledVersionsController integration test stubs"""

    def test_game_center_enabled_versions_compatible_versions_create_to_many_relationship(self):
        """Test case for game_center_enabled_versions_compatible_versions_create_to_many_relationship

        
        """
        game_center_enabled_version_compatible_versions_linkages_request = {"data":[{"id":"id","type":"gameCenterEnabledVersions"},{"id":"id","type":"gameCenterEnabledVersions"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(game_center_enabled_version_compatible_versions_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_game_center_enabled_versions_compatible_versions_delete_to_many_relationship(self):
        """Test case for game_center_enabled_versions_compatible_versions_delete_to_many_relationship

        
        """
        game_center_enabled_version_compatible_versions_linkages_request = {"data":[{"id":"id","type":"gameCenterEnabledVersions"},{"id":"id","type":"gameCenterEnabledVersions"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(game_center_enabled_version_compatible_versions_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_game_center_enabled_versions_compatible_versions_get_to_many_related(self):
        """Test case for game_center_enabled_versions_compatible_versions_get_to_many_related

        
        """
        query_string = [('filter[platform]', ['filter_platform_example']),
                        ('filter[versionString]', ['filter_version_string_example']),
                        ('filter[app]', ['filter_app_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[gameCenterEnabledVersions]', ['fields_game_center_enabled_versions_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/gameCenterEnabledVersions/{id}/compatibleVersions'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_game_center_enabled_versions_compatible_versions_get_to_many_relationship(self):
        """Test case for game_center_enabled_versions_compatible_versions_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_game_center_enabled_versions_compatible_versions_replace_to_many_relationship(self):
        """Test case for game_center_enabled_versions_compatible_versions_replace_to_many_relationship

        
        """
        game_center_enabled_version_compatible_versions_linkages_request = {"data":[{"id":"id","type":"gameCenterEnabledVersions"},{"id":"id","type":"gameCenterEnabledVersions"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(game_center_enabled_version_compatible_versions_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
