import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_allstarballotpredictor_get(self):
        """Test case for allstarballotpredictor_get

        
        """
        query_string = [('PointCap', 'point_cap_example'),
                        ('WestPlayer1', 'west_player1_example'),
                        ('WestPlayer2', 'west_player2_example'),
                        ('WestPlayer3', 'west_player3_example'),
                        ('WestPlayer4', 'west_player4_example'),
                        ('WestPlayer5', 'west_player5_example'),
                        ('EastPlayer1', 'east_player1_example'),
                        ('EastPlayer2', 'east_player2_example'),
                        ('EastPlayer3', 'east_player3_example'),
                        ('EastPlayer4', 'east_player4_example'),
                        ('EastPlayer5', 'east_player5_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/allstarballotpredictor',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscore_get(self):
        """Test case for boxscore_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscore',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoreadvanced_get(self):
        """Test case for boxscoreadvanced_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoreadvanced',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoreadvancedv2_get(self):
        """Test case for boxscoreadvancedv2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoreadvancedv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscorefourfactors_get(self):
        """Test case for boxscorefourfactors_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscorefourfactors',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscorefourfactorsv2_get(self):
        """Test case for boxscorefourfactorsv2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscorefourfactorsv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoremisc_get(self):
        """Test case for boxscoremisc_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoremisc',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoremiscv2_get(self):
        """Test case for boxscoremiscv2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoremiscv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoreplayertrackv2_get(self):
        """Test case for boxscoreplayertrackv2_get

        
        """
        query_string = [('GameID', 'game_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoreplayertrackv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscorescoring_get(self):
        """Test case for boxscorescoring_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscorescoring',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscorescoringv2_get(self):
        """Test case for boxscorescoringv2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscorescoringv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoresummaryv2_get(self):
        """Test case for boxscoresummaryv2_get

        
        """
        query_string = [('GameID', 'game_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoresummaryv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoretraditionalv2_get(self):
        """Test case for boxscoretraditionalv2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoretraditionalv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoreusage_get(self):
        """Test case for boxscoreusage_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoreusage',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boxscoreusagev2_get(self):
        """Test case for boxscoreusagev2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example'),
                        ('StartRange', 'start_range_example'),
                        ('EndRange', 'end_range_example'),
                        ('RangeType', 'range_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/boxscoreusagev2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_common_team_years_get(self):
        """Test case for common_team_years_get

        
        """
        query_string = [('LeagueID', 'league_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/commonTeamYears',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_commonallplayers_get(self):
        """Test case for commonallplayers_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('IsOnlyCurrentSeason', 'is_only_current_season_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/commonallplayers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_commonplayerinfo_get(self):
        """Test case for commonplayerinfo_get

        
        """
        query_string = [('PlayerID', 'player_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/commonplayerinfo',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_commonplayoffseries_get(self):
        """Test case for commonplayoffseries_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('Season', 'season_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/commonplayoffseries',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_commonteamroster_get(self):
        """Test case for commonteamroster_get

        
        """
        query_string = [('Season', 'season_example'),
                        ('TeamID', 'team_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/commonteamroster',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_draftcombinedrillresults_get(self):
        """Test case for draftcombinedrillresults_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonYear', 'season_year_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/draftcombinedrillresults',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_draftcombinenonstationaryshooting_get(self):
        """Test case for draftcombinenonstationaryshooting_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonYear', 'season_year_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/draftcombinenonstationaryshooting',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_draftcombineplayeranthro_get(self):
        """Test case for draftcombineplayeranthro_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonYear', 'season_year_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/draftcombineplayeranthro',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_draftcombinespotshooting_get(self):
        """Test case for draftcombinespotshooting_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonYear', 'season_year_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/draftcombinespotshooting',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_draftcombinestats_get(self):
        """Test case for draftcombinestats_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonYear', 'season_year_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/draftcombinestats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_drafthistory_get(self):
        """Test case for drafthistory_get

        
        """
        query_string = [('LeagueID', 'league_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/drafthistory',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_franchisehistory_get(self):
        """Test case for franchisehistory_get

        
        """
        query_string = [('LeagueID', 'league_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/franchisehistory',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_homepageleaders_get(self):
        """Test case for homepageleaders_get

        
        """
        query_string = [('StatCategory', 'stat_category_example'),
                        ('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerOrTeam', 'player_or_team_example'),
                        ('Game', 'game_example'),
                        ('Player', 'player_example'),
                        ('PlayerScope', 'player_scope_example'),
                        ('GameScope', 'game_scope_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/homepageleaders',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_homepagev2_get(self):
        """Test case for homepagev2_get

        
        """
        query_string = [('StatType', 'stat_type_example'),
                        ('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerOrTeam', 'player_or_team_example'),
                        ('Game', 'game_example'),
                        ('Player', 'player_example'),
                        ('PlayerScope', 'player_scope_example'),
                        ('GameScope', 'game_scope_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/homepagev2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaderstiles_get(self):
        """Test case for leaderstiles_get

        
        """
        query_string = [('Stat', 'stat_example'),
                        ('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerOrTeam', 'player_or_team_example'),
                        ('Game', 'game_example'),
                        ('Player', 'player_example'),
                        ('PlayerScope', 'player_scope_example'),
                        ('GameScope', 'game_scope_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaderstiles',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashlineups_get(self):
        """Test case for leaguedashlineups_get

        
        """
        query_string = [('GroupQuantity', 'group_quantity_example'),
                        ('SeasonType', 'season_type_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashlineups',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashplayerbiostats_get(self):
        """Test case for leaguedashplayerbiostats_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashplayerbiostats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashplayerclutch_get(self):
        """Test case for leaguedashplayerclutch_get

        
        """
        query_string = [('ClutchTime', 'clutch_time_example'),
                        ('AheadBehind', 'ahead_behind_example'),
                        ('PointDiff', 'point_diff_example'),
                        ('GameScope', 'game_scope_example'),
                        ('PlayerExperience', 'player_experience_example'),
                        ('PlayerPosition', 'player_position_example'),
                        ('StarterBench', 'starter_bench_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashplayerclutch',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashplayerptshot_get(self):
        """Test case for leaguedashplayerptshot_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashplayerptshot',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashplayershotlocations_get(self):
        """Test case for leaguedashplayershotlocations_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example'),
                        ('DistanceRange', 'distance_range_example'),
                        ('GameScope', 'game_scope_example'),
                        ('PlayerExperience', 'player_experience_example'),
                        ('PlayerPosition', 'player_position_example'),
                        ('StarterBench', 'starter_bench_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashplayershotlocations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashplayerstats_get(self):
        """Test case for leaguedashplayerstats_get

        
        """
        query_string = [('GameScope', 'game_scope_example'),
                        ('PlayerExperience', 'player_experience_example'),
                        ('PlayerPosition', 'player_position_example'),
                        ('StarterBench', 'starter_bench_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashplayerstats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashptdefend_get(self):
        """Test case for leaguedashptdefend_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('DefenseCategory', 'defense_category_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashptdefend',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashptteamdefend_get(self):
        """Test case for leaguedashptteamdefend_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('DefenseCategory', 'defense_category_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashptteamdefend',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashteamclutch_get(self):
        """Test case for leaguedashteamclutch_get

        
        """
        query_string = [('ClutchTime', 'clutch_time_example'),
                        ('AheadBehind', 'ahead_behind_example'),
                        ('PointDiff', 'point_diff_example'),
                        ('GameScope', 'game_scope_example'),
                        ('PlayerExperience', 'player_experience_example'),
                        ('PlayerPosition', 'player_position_example'),
                        ('StarterBench', 'starter_bench_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashteamclutch',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashteamptshot_get(self):
        """Test case for leaguedashteamptshot_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashteamptshot',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashteamshotlocations_get(self):
        """Test case for leaguedashteamshotlocations_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example'),
                        ('DistanceRange', 'distance_range_example'),
                        ('GameScope', 'game_scope_example'),
                        ('PlayerExperience', 'player_experience_example'),
                        ('PlayerPosition', 'player_position_example'),
                        ('StarterBench', 'starter_bench_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashteamshotlocations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leaguedashteamstats_get(self):
        """Test case for leaguedashteamstats_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leaguedashteamstats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leagueleaders_get(self):
        """Test case for leagueleaders_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('PerMode', 'per_mode_example'),
                        ('StatCategory', 'stat_category_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Scope', 'scope_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/leagueleaders',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playbyplay_get(self):
        """Test case for playbyplay_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playbyplay',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playbyplayv2_get(self):
        """Test case for playbyplayv2_get

        
        """
        query_string = [('GameID', 'game_id_example'),
                        ('StartPeriod', 'start_period_example'),
                        ('EndPeriod', 'end_period_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playbyplayv2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playercareerstats_get(self):
        """Test case for playercareerstats_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('PlayerID', 'player_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playercareerstats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playercompare_get(self):
        """Test case for playercompare_get

        
        """
        query_string = [('PlayerIDList', 'player_id_list_example'),
                        ('VsPlayerIDList', 'vs_player_id_list_example'),
                        ('SeasonType', 'season_type_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playercompare',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbyclutch_get(self):
        """Test case for playerdashboardbyclutch_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbyclutch',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbygamesplits_get(self):
        """Test case for playerdashboardbygamesplits_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbygamesplits',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbygeneralsplits_get(self):
        """Test case for playerdashboardbygeneralsplits_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbygeneralsplits',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbylastngames_get(self):
        """Test case for playerdashboardbylastngames_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbylastngames',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbyopponent_get(self):
        """Test case for playerdashboardbyopponent_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbyopponent',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbyshootingsplits_get(self):
        """Test case for playerdashboardbyshootingsplits_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbyshootingsplits',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbyteamperformance_get(self):
        """Test case for playerdashboardbyteamperformance_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbyteamperformance',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashboardbyyearoveryear_get(self):
        """Test case for playerdashboardbyyearoveryear_get

        
        """
        query_string = [('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashboardbyyearoveryear',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashptpass_get(self):
        """Test case for playerdashptpass_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashptpass',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashptreb_get(self):
        """Test case for playerdashptreb_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashptreb',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashptreboundlogs_get(self):
        """Test case for playerdashptreboundlogs_get

        
        """
        query_string = [('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashptreboundlogs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashptshotdefend_get(self):
        """Test case for playerdashptshotdefend_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashptshotdefend',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashptshotlog_get(self):
        """Test case for playerdashptshotlog_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('TeamID', 'team_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashptshotlog',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerdashptshots_get(self):
        """Test case for playerdashptshots_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PlayerID', 'player_id_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerdashptshots',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playergamelog_get(self):
        """Test case for playergamelog_get

        
        """
        query_string = [('PlayerID', 'player_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playergamelog',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerprofile_get(self):
        """Test case for playerprofile_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('PlayerID', 'player_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('GraphStartSeason', 'graph_start_season_example'),
                        ('GraphEndSeason', 'graph_end_season_example'),
                        ('GraphStat', 'graph_stat_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerprofile',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playerprofilev2_get(self):
        """Test case for playerprofilev2_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('PlayerID', 'player_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playerprofilev2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playersvsplayers_get(self):
        """Test case for playersvsplayers_get

        
        """
        query_string = [('PlayerTeamID', 'player_team_id_example'),
                        ('PlayerID1', 'player_id1_example'),
                        ('PlayerID2', 'player_id2_example'),
                        ('PlayerID3', 'player_id3_example'),
                        ('PlayerID4', 'player_id4_example'),
                        ('PlayerID5', 'player_id5_example'),
                        ('VsTeamID', 'vs_team_id_example'),
                        ('VsPlayerID1', 'vs_player_id1_example'),
                        ('VsPlayerID2', 'vs_player_id2_example'),
                        ('VsPlayerID3', 'vs_player_id3_example'),
                        ('VsPlayerID4', 'vs_player_id4_example'),
                        ('VsPlayerID5', 'vs_player_id5_example'),
                        ('SeasonType', 'season_type_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playersvsplayers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playervsplayer_get(self):
        """Test case for playervsplayer_get

        
        """
        query_string = [('PlayerID', 'player_id_example'),
                        ('VsPlayerID', 'vs_player_id_example'),
                        ('SeasonType', 'season_type_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playervsplayer',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_playoffpicture_get(self):
        """Test case for playoffpicture_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonID', 'season_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/playoffpicture',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_scoreboard_get(self):
        """Test case for scoreboard_get

        
        """
        query_string = [('GameDate', 'game_date_example'),
                        ('LeagueID', 'league_id_example'),
                        ('DayOffset', 'day_offset_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/scoreboard',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_scoreboard_v2_get(self):
        """Test case for scoreboard_v2_get

        
        """
        query_string = [('GameDate', 'game_date_example'),
                        ('LeagueID', 'league_id_example'),
                        ('DayOffset', 'day_offset_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/scoreboardV2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shotchartdetail_get(self):
        """Test case for shotchartdetail_get

        
        """
        query_string = [('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('PlayerID', 'player_id_example'),
                        ('GameID', 'game_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('Position', 'position_example'),
                        ('RookieYear', 'rookie_year_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example'),
                        ('ContextMeasure', 'context_measure_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/shotchartdetail',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shotchartlineupdetail_get(self):
        """Test case for shotchartlineupdetail_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example'),
                        ('GameID', 'game_id_example'),
                        ('GROUP_ID', 'group_id_example'),
                        ('ContextMeasure', 'context_measure_example'),
                        ('ContextFilter', 'context_filter_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/shotchartlineupdetail',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbyclutch_get(self):
        """Test case for teamdashboardbyclutch_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbyclutch',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbygamesplits_get(self):
        """Test case for teamdashboardbygamesplits_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbygamesplits',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbygeneralsplits_get(self):
        """Test case for teamdashboardbygeneralsplits_get

        
        """
        query_string = [('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbygeneralsplits',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbylastngames_get(self):
        """Test case for teamdashboardbylastngames_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbylastngames',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbyopponent_get(self):
        """Test case for teamdashboardbyopponent_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbyopponent',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbyshootingsplits_get(self):
        """Test case for teamdashboardbyshootingsplits_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbyshootingsplits',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbyteamperformance_get(self):
        """Test case for teamdashboardbyteamperformance_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbyteamperformance',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashboardbyyearoveryear_get(self):
        """Test case for teamdashboardbyyearoveryear_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashboardbyyearoveryear',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashlineups_get(self):
        """Test case for teamdashlineups_get

        
        """
        query_string = [('GroupQuantity', 'group_quantity_example'),
                        ('GameID', 'game_id_example'),
                        ('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashlineups',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashptpass_get(self):
        """Test case for teamdashptpass_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashptpass',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashptreb_get(self):
        """Test case for teamdashptreb_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashptreb',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamdashptshots_get(self):
        """Test case for teamdashptshots_get

        
        """
        query_string = [('PerMode', 'per_mode_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamdashptshots',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamgamelog_get(self):
        """Test case for teamgamelog_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamgamelog',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teaminfocommon_get(self):
        """Test case for teaminfocommon_get

        
        """
        query_string = [('Season', 'season_example'),
                        ('TeamID', 'team_id_example'),
                        ('LeagueID', 'league_id_example'),
                        ('SeasonType', 'season_type_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teaminfocommon',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamplayerdashboard_get(self):
        """Test case for teamplayerdashboard_get

        
        """
        query_string = [('SeasonType', 'season_type_example'),
                        ('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamplayerdashboard',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamplayeronoffdetails_get(self):
        """Test case for teamplayeronoffdetails_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamplayeronoffdetails',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamplayeronoffsummary_get(self):
        """Test case for teamplayeronoffsummary_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('SeasonType', 'season_type_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamplayeronoffsummary',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamvsplayer_get(self):
        """Test case for teamvsplayer_get

        
        """
        query_string = [('TeamID', 'team_id_example'),
                        ('VsPlayerID', 'vs_player_id_example'),
                        ('SeasonType', 'season_type_example'),
                        ('MeasureType', 'measure_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('PlusMinus', 'plus_minus_example'),
                        ('PaceAdjust', 'pace_adjust_example'),
                        ('Rank', 'rank_example'),
                        ('Season', 'season_example'),
                        ('Outcome', 'outcome_example'),
                        ('Location', 'location_example'),
                        ('Month', 'month_example'),
                        ('SeasonSegment', 'season_segment_example'),
                        ('DateFrom', 'date_from_example'),
                        ('DateTo', 'date_to_example'),
                        ('OpponentTeamID', 'opponent_team_id_example'),
                        ('VsConference', 'vs_conference_example'),
                        ('VsDivision', 'vs_division_example'),
                        ('GameSegment', 'game_segment_example'),
                        ('Period', 'period_example'),
                        ('LastNGames', 'last_n_games_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamvsplayer',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_teamyearbyyearstats_get(self):
        """Test case for teamyearbyyearstats_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('SeasonType', 'season_type_example'),
                        ('PerMode', 'per_mode_example'),
                        ('TeamID', 'team_id_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/teamyearbyyearstats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_video_status_get(self):
        """Test case for video_status_get

        
        """
        query_string = [('LeagueID', 'league_id_example'),
                        ('GameDate', 'game_date_example')]
        headers = { 
        }
        response = self.client.open(
            '/stats/videoStatus',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
