import unittest

from flask import json

from openapi_server.models.ranking_week import RankingWeek  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRankingsController(BaseTestCase):
    """RankingsController integration test stubs"""

    def test_get_rankings(self):
        """Test case for get_rankings

        Historical polls and rankings
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('seasonType', 'regular')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/rankings',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
