import unittest

from flask import json

from openapi_server.models.advanced_game_stat import AdvancedGameStat  # noqa: E501
from openapi_server.models.advanced_season_stat import AdvancedSeasonStat  # noqa: E501
from openapi_server.models.team_season_stat import TeamSeasonStat  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStatsController(BaseTestCase):
    """StatsController integration test stubs"""

    def test_get_advanced_team_game_stats(self):
        """Test case for get_advanced_team_game_stats

        Advanced team metrics by game
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('opponent', 'opponent_example'),
                        ('excludeGarbageTime', True),
                        ('seasonType', 'season_type_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/stats/game/advanced',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_advanced_team_season_stats(self):
        """Test case for get_advanced_team_season_stats

        Advanced team metrics by season
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('excludeGarbageTime', True),
                        ('startWeek', 56),
                        ('endWeek', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/stats/season/advanced',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stat_categories(self):
        """Test case for get_stat_categories

        Team stat categories
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/stats/categories',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_team_season_stats(self):
        """Test case for get_team_season_stats

        Team statistics by season
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('startWeek', 56),
                        ('endWeek', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/stats/season',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
