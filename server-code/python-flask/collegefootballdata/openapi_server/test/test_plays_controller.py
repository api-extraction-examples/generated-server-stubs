import unittest

from flask import json

from openapi_server.models.live_play_by_play import LivePlayByPlay  # noqa: E501
from openapi_server.models.play import Play  # noqa: E501
from openapi_server.models.play_stat import PlayStat  # noqa: E501
from openapi_server.models.play_stat_type import PlayStatType  # noqa: E501
from openapi_server.models.play_type import PlayType  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPlaysController(BaseTestCase):
    """PlaysController integration test stubs"""

    def test_get_live_plays(self):
        """Test case for get_live_plays

        Live metrics and PBP (Patreon only)
        """
        query_string = [('id', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/live/plays',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_play_stat_types(self):
        """Test case for get_play_stat_types

        Types of player play stats
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/play/stat/types',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_play_stats(self):
        """Test case for get_play_stats

        Play stats by play
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('gameId', 56),
                        ('athleteId', 56),
                        ('statTypeId', 56),
                        ('seasonType', 'season_type_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/play/stats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_play_types(self):
        """Test case for get_play_types

        Play types
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/play/types',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_plays(self):
        """Test case for get_plays

        Play by play data
        """
        query_string = [('seasonType', 'regular'),
                        ('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('offense', 'offense_example'),
                        ('defense', 'defense_example'),
                        ('conference', 'conference_example'),
                        ('offenseConference', 'offense_conference_example'),
                        ('defenseConference', 'defense_conference_example'),
                        ('playType', 56),
                        ('classification', 'classification_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/plays',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
