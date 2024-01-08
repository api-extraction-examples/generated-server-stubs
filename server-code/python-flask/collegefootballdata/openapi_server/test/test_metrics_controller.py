import unittest

from flask import json

from openapi_server.models.game_ppa import GamePPA  # noqa: E501
from openapi_server.models.play_wp import PlayWP  # noqa: E501
from openapi_server.models.player_game_ppa import PlayerGamePPA  # noqa: E501
from openapi_server.models.player_season_ppa import PlayerSeasonPPA  # noqa: E501
from openapi_server.models.predicted_points import PredictedPoints  # noqa: E501
from openapi_server.models.pregame_wp import PregameWP  # noqa: E501
from openapi_server.models.team_ppa import TeamPPA  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMetricsController(BaseTestCase):
    """MetricsController integration test stubs"""

    def test_get_game_ppa(self):
        """Test case for get_game_ppa

        Team Predicated Points Added (PPA/EPA) by game
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('excludeGarbageTime', True),
                        ('seasonType', 'regular')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ppa/games',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_player_game_ppa(self):
        """Test case for get_player_game_ppa

        Player Predicated Points Added (PPA/EPA) broken down by game
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('position', 'position_example'),
                        ('playerId', 56),
                        ('threshold', 'threshold_example'),
                        ('excludeGarbageTime', True),
                        ('seasonType', 'regular')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ppa/players/games',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_player_season_ppa(self):
        """Test case for get_player_season_ppa

        Player Predicated Points Added (PPA/EPA) broken down by season
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('position', 'position_example'),
                        ('playerId', 56),
                        ('threshold', 'threshold_example'),
                        ('excludeGarbageTime', True)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ppa/players/season',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_predicted_points(self):
        """Test case for get_predicted_points

        Predicted Points (i.e. Expected Points or EP)
        """
        query_string = [('down', 56),
                        ('distance', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ppa/predicted',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_pregame_win_probabilities(self):
        """Test case for get_pregame_win_probabilities

        Pregame win probability data
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('seasonType', 'season_type_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/metrics/wp/pregame',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_team_ppa(self):
        """Test case for get_team_ppa

        Predicted Points Added (PPA/EPA) data by team
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('excludeGarbageTime', True)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ppa/teams',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_win_probability_data(self):
        """Test case for get_win_probability_data

        Win probability chart data
        """
        query_string = [('gameId', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/metrics/wp',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
