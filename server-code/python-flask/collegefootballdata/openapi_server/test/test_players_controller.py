import unittest

from flask import json

from openapi_server.models.player_search_result import PlayerSearchResult  # noqa: E501
from openapi_server.models.player_season_stat import PlayerSeasonStat  # noqa: E501
from openapi_server.models.player_usage import PlayerUsage  # noqa: E501
from openapi_server.models.portal_player import PortalPlayer  # noqa: E501
from openapi_server.models.returning_production import ReturningProduction  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPlayersController(BaseTestCase):
    """PlayersController integration test stubs"""

    def test_get_player_season_stats(self):
        """Test case for get_player_season_stats

        Player stats by season
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('startWeek', 56),
                        ('endWeek', 56),
                        ('seasonType', 'season_type_example'),
                        ('category', 'category_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/stats/player/season',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_player_usage(self):
        """Test case for get_player_usage

        Player usage metrics broken down by season
        """
        query_string = [('year', 2022),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('position', 'position_example'),
                        ('playerId', 56),
                        ('excludeGarbageTime', True)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/player/usage',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_returning_production(self):
        """Test case for get_returning_production

        Team returning production metrics
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/player/returning',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_transfer_portal(self):
        """Test case for get_transfer_portal

        Transfer portal by season
        """
        query_string = [('year', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/player/portal',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_player_search(self):
        """Test case for player_search

        Search for player information
        """
        query_string = [('searchTerm', 'search_term_example'),
                        ('position', 'position_example'),
                        ('team', 'team_example'),
                        ('year', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/player/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
