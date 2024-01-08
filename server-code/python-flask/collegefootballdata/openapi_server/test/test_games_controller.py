import unittest

from flask import json

from openapi_server.models.box_score import BoxScore  # noqa: E501
from openapi_server.models.game import Game  # noqa: E501
from openapi_server.models.game_media import GameMedia  # noqa: E501
from openapi_server.models.game_weather import GameWeather  # noqa: E501
from openapi_server.models.player_game import PlayerGame  # noqa: E501
from openapi_server.models.scoreboard_game import ScoreboardGame  # noqa: E501
from openapi_server.models.team_game import TeamGame  # noqa: E501
from openapi_server.models.team_record import TeamRecord  # noqa: E501
from openapi_server.models.week import Week  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGamesController(BaseTestCase):
    """GamesController integration test stubs"""

    def test_get_advanced_box_score(self):
        """Test case for get_advanced_box_score

        Advanced box scores
        """
        query_string = [('gameId', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/game/box/advanced',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_calendar(self):
        """Test case for get_calendar

        Season calendar
        """
        query_string = [('year', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/calendar',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_game_media(self):
        """Test case for get_game_media

        Game media information and schedules
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('seasonType', 'season_type_example'),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('mediaType', 'media_type_example'),
                        ('classification', 'classification_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/games/media',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_game_weather(self):
        """Test case for get_game_weather

        Game weather information (Patreon only)
        """
        query_string = [('gameId', 56),
                        ('year', 56),
                        ('week', 56),
                        ('seasonType', 'season_type_example'),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('classification', 'classification_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/games/weather',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_games(self):
        """Test case for get_games

        Games and results
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('seasonType', 'regular'),
                        ('team', 'team_example'),
                        ('home', 'home_example'),
                        ('away', 'away_example'),
                        ('conference', 'conference_example'),
                        ('division', 'division_example'),
                        ('id', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/games',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_player_game_stats(self):
        """Test case for get_player_game_stats

        Player game stats
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('seasonType', 'regular'),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('category', 'category_example'),
                        ('gameId', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/games/players',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_scoreboard(self):
        """Test case for get_scoreboard

        Live game results (Patreon only)
        """
        query_string = [('classification', 'classification_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/scoreboard',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_team_game_stats(self):
        """Test case for get_team_game_stats

        Team game stats
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('seasonType', 'regular'),
                        ('team', 'team_example'),
                        ('conference', 'conference_example'),
                        ('gameId', 56),
                        ('classification', 'classification_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/games/teams',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_team_records(self):
        """Test case for get_team_records

        Team records
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/records',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
