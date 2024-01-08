import unittest

from flask import json

from openapi_server.models.game_lines import GameLines  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBettingController(BaseTestCase):
    """BettingController integration test stubs"""

    def test_get_lines(self):
        """Test case for get_lines

        Betting lines
        """
        query_string = [('gameId', 56),
                        ('year', 56),
                        ('week', 56),
                        ('seasonType', 'regular'),
                        ('team', 'team_example'),
                        ('home', 'home_example'),
                        ('away', 'away_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/lines',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
