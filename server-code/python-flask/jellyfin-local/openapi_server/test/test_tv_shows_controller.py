import unittest

from flask import json

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTvShowsController(BaseTestCase):
    """TvShowsController integration test stubs"""

    def test_get_episodes(self):
        """Test case for get_episodes

        Gets episodes for a tv season.
        """
        query_string = [('userId', 'user_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('season', 56),
                        ('seasonId', 'season_id_example'),
                        ('isMissing', True),
                        ('adjacentTo', 'adjacent_to_example'),
                        ('startItemId', 'start_item_id_example'),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('enableImages', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('enableUserData', True),
                        ('sortBy', 'sort_by_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Shows/{series_id}/Episodes'.format(series_id='series_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_next_up(self):
        """Test case for get_next_up

        Gets a list of next up episodes.
        """
        query_string = [('userId', 'user_id_example'),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('seriesId', 'series_id_example'),
                        ('parentId', 'parent_id_example'),
                        ('enableImges', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('enableUserData', True),
                        ('enableTotalRecordCount', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Shows/NextUp',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_seasons(self):
        """Test case for get_seasons

        Gets seasons for a tv series.
        """
        query_string = [('userId', 'user_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('isSpecialSeason', True),
                        ('isMissing', True),
                        ('adjacentTo', 'adjacent_to_example'),
                        ('enableImages', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('enableUserData', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Shows/{series_id}/Seasons'.format(series_id='series_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_upcoming_episodes(self):
        """Test case for get_upcoming_episodes

        Gets a list of upcoming episodes.
        """
        query_string = [('userId', 'user_id_example'),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('parentId', 'parent_id_example'),
                        ('enableImges', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('enableUserData', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Shows/Upcoming',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
