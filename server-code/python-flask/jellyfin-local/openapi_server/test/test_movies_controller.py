import unittest

from flask import json

from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.recommendation_dto import RecommendationDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMoviesController(BaseTestCase):
    """MoviesController integration test stubs"""

    def test_get_movie_recommendations(self):
        """Test case for get_movie_recommendations

        Gets movie recommendations.
        """
        query_string = [('userId', 'user_id_example'),
                        ('parentId', 'parent_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('categoryLimit', 5),
                        ('itemLimit', 8)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Movies/Recommendations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
