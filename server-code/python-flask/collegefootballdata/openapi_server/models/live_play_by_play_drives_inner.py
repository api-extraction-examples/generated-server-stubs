from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.live_play_by_play_drives_inner_plays_inner import LivePlayByPlayDrivesInnerPlaysInner
from openapi_server import util

from openapi_server.models.live_play_by_play_drives_inner_plays_inner import LivePlayByPlayDrivesInnerPlaysInner  # noqa: E501

class LivePlayByPlayDrivesInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, defense=None, defense_id=None, duration=None, end_clock=None, end_period=None, end_yards_to_goal=None, id=None, offense=None, offense_id=None, play_count=None, plays=None, scoring_opportunity=None, start_clock=None, start_period=None, start_yards_to_goal=None, yards=None):  # noqa: E501
        """LivePlayByPlayDrivesInner - a model defined in OpenAPI

        :param defense: The defense of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type defense: str
        :param defense_id: The defense_id of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type defense_id: int
        :param duration: The duration of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type duration: str
        :param end_clock: The end_clock of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type end_clock: str
        :param end_period: The end_period of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type end_period: int
        :param end_yards_to_goal: The end_yards_to_goal of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type end_yards_to_goal: int
        :param id: The id of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type id: int
        :param offense: The offense of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type offense: str
        :param offense_id: The offense_id of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type offense_id: int
        :param play_count: The play_count of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type play_count: int
        :param plays: The plays of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type plays: List[LivePlayByPlayDrivesInnerPlaysInner]
        :param scoring_opportunity: The scoring_opportunity of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type scoring_opportunity: bool
        :param start_clock: The start_clock of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type start_clock: str
        :param start_period: The start_period of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type start_period: int
        :param start_yards_to_goal: The start_yards_to_goal of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type start_yards_to_goal: int
        :param yards: The yards of this LivePlayByPlayDrivesInner.  # noqa: E501
        :type yards: int
        """
        self.openapi_types = {
            'defense': str,
            'defense_id': int,
            'duration': str,
            'end_clock': str,
            'end_period': int,
            'end_yards_to_goal': int,
            'id': int,
            'offense': str,
            'offense_id': int,
            'play_count': int,
            'plays': List[LivePlayByPlayDrivesInnerPlaysInner],
            'scoring_opportunity': bool,
            'start_clock': str,
            'start_period': int,
            'start_yards_to_goal': int,
            'yards': int
        }

        self.attribute_map = {
            'defense': 'defense',
            'defense_id': 'defenseId',
            'duration': 'duration',
            'end_clock': 'endClock',
            'end_period': 'endPeriod',
            'end_yards_to_goal': 'endYardsToGoal',
            'id': 'id',
            'offense': 'offense',
            'offense_id': 'offenseId',
            'play_count': 'playCount',
            'plays': 'plays',
            'scoring_opportunity': 'scoringOpportunity',
            'start_clock': 'startClock',
            'start_period': 'startPeriod',
            'start_yards_to_goal': 'startYardsToGoal',
            'yards': 'yards'
        }

        self._defense = defense
        self._defense_id = defense_id
        self._duration = duration
        self._end_clock = end_clock
        self._end_period = end_period
        self._end_yards_to_goal = end_yards_to_goal
        self._id = id
        self._offense = offense
        self._offense_id = offense_id
        self._play_count = play_count
        self._plays = plays
        self._scoring_opportunity = scoring_opportunity
        self._start_clock = start_clock
        self._start_period = start_period
        self._start_yards_to_goal = start_yards_to_goal
        self._yards = yards

    @classmethod
    def from_dict(cls, dikt) -> 'LivePlayByPlayDrivesInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LivePlayByPlay_drives_inner of this LivePlayByPlayDrivesInner.  # noqa: E501
        :rtype: LivePlayByPlayDrivesInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def defense(self) -> str:
        """Gets the defense of this LivePlayByPlayDrivesInner.


        :return: The defense of this LivePlayByPlayDrivesInner.
        :rtype: str
        """
        return self._defense

    @defense.setter
    def defense(self, defense: str):
        """Sets the defense of this LivePlayByPlayDrivesInner.


        :param defense: The defense of this LivePlayByPlayDrivesInner.
        :type defense: str
        """

        self._defense = defense

    @property
    def defense_id(self) -> int:
        """Gets the defense_id of this LivePlayByPlayDrivesInner.


        :return: The defense_id of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._defense_id

    @defense_id.setter
    def defense_id(self, defense_id: int):
        """Sets the defense_id of this LivePlayByPlayDrivesInner.


        :param defense_id: The defense_id of this LivePlayByPlayDrivesInner.
        :type defense_id: int
        """

        self._defense_id = defense_id

    @property
    def duration(self) -> str:
        """Gets the duration of this LivePlayByPlayDrivesInner.


        :return: The duration of this LivePlayByPlayDrivesInner.
        :rtype: str
        """
        return self._duration

    @duration.setter
    def duration(self, duration: str):
        """Sets the duration of this LivePlayByPlayDrivesInner.


        :param duration: The duration of this LivePlayByPlayDrivesInner.
        :type duration: str
        """

        self._duration = duration

    @property
    def end_clock(self) -> str:
        """Gets the end_clock of this LivePlayByPlayDrivesInner.


        :return: The end_clock of this LivePlayByPlayDrivesInner.
        :rtype: str
        """
        return self._end_clock

    @end_clock.setter
    def end_clock(self, end_clock: str):
        """Sets the end_clock of this LivePlayByPlayDrivesInner.


        :param end_clock: The end_clock of this LivePlayByPlayDrivesInner.
        :type end_clock: str
        """

        self._end_clock = end_clock

    @property
    def end_period(self) -> int:
        """Gets the end_period of this LivePlayByPlayDrivesInner.


        :return: The end_period of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._end_period

    @end_period.setter
    def end_period(self, end_period: int):
        """Sets the end_period of this LivePlayByPlayDrivesInner.


        :param end_period: The end_period of this LivePlayByPlayDrivesInner.
        :type end_period: int
        """

        self._end_period = end_period

    @property
    def end_yards_to_goal(self) -> int:
        """Gets the end_yards_to_goal of this LivePlayByPlayDrivesInner.


        :return: The end_yards_to_goal of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._end_yards_to_goal

    @end_yards_to_goal.setter
    def end_yards_to_goal(self, end_yards_to_goal: int):
        """Sets the end_yards_to_goal of this LivePlayByPlayDrivesInner.


        :param end_yards_to_goal: The end_yards_to_goal of this LivePlayByPlayDrivesInner.
        :type end_yards_to_goal: int
        """

        self._end_yards_to_goal = end_yards_to_goal

    @property
    def id(self) -> int:
        """Gets the id of this LivePlayByPlayDrivesInner.


        :return: The id of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this LivePlayByPlayDrivesInner.


        :param id: The id of this LivePlayByPlayDrivesInner.
        :type id: int
        """

        self._id = id

    @property
    def offense(self) -> str:
        """Gets the offense of this LivePlayByPlayDrivesInner.


        :return: The offense of this LivePlayByPlayDrivesInner.
        :rtype: str
        """
        return self._offense

    @offense.setter
    def offense(self, offense: str):
        """Sets the offense of this LivePlayByPlayDrivesInner.


        :param offense: The offense of this LivePlayByPlayDrivesInner.
        :type offense: str
        """

        self._offense = offense

    @property
    def offense_id(self) -> int:
        """Gets the offense_id of this LivePlayByPlayDrivesInner.


        :return: The offense_id of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._offense_id

    @offense_id.setter
    def offense_id(self, offense_id: int):
        """Sets the offense_id of this LivePlayByPlayDrivesInner.


        :param offense_id: The offense_id of this LivePlayByPlayDrivesInner.
        :type offense_id: int
        """

        self._offense_id = offense_id

    @property
    def play_count(self) -> int:
        """Gets the play_count of this LivePlayByPlayDrivesInner.


        :return: The play_count of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._play_count

    @play_count.setter
    def play_count(self, play_count: int):
        """Sets the play_count of this LivePlayByPlayDrivesInner.


        :param play_count: The play_count of this LivePlayByPlayDrivesInner.
        :type play_count: int
        """

        self._play_count = play_count

    @property
    def plays(self) -> List[LivePlayByPlayDrivesInnerPlaysInner]:
        """Gets the plays of this LivePlayByPlayDrivesInner.


        :return: The plays of this LivePlayByPlayDrivesInner.
        :rtype: List[LivePlayByPlayDrivesInnerPlaysInner]
        """
        return self._plays

    @plays.setter
    def plays(self, plays: List[LivePlayByPlayDrivesInnerPlaysInner]):
        """Sets the plays of this LivePlayByPlayDrivesInner.


        :param plays: The plays of this LivePlayByPlayDrivesInner.
        :type plays: List[LivePlayByPlayDrivesInnerPlaysInner]
        """

        self._plays = plays

    @property
    def scoring_opportunity(self) -> bool:
        """Gets the scoring_opportunity of this LivePlayByPlayDrivesInner.


        :return: The scoring_opportunity of this LivePlayByPlayDrivesInner.
        :rtype: bool
        """
        return self._scoring_opportunity

    @scoring_opportunity.setter
    def scoring_opportunity(self, scoring_opportunity: bool):
        """Sets the scoring_opportunity of this LivePlayByPlayDrivesInner.


        :param scoring_opportunity: The scoring_opportunity of this LivePlayByPlayDrivesInner.
        :type scoring_opportunity: bool
        """

        self._scoring_opportunity = scoring_opportunity

    @property
    def start_clock(self) -> str:
        """Gets the start_clock of this LivePlayByPlayDrivesInner.


        :return: The start_clock of this LivePlayByPlayDrivesInner.
        :rtype: str
        """
        return self._start_clock

    @start_clock.setter
    def start_clock(self, start_clock: str):
        """Sets the start_clock of this LivePlayByPlayDrivesInner.


        :param start_clock: The start_clock of this LivePlayByPlayDrivesInner.
        :type start_clock: str
        """

        self._start_clock = start_clock

    @property
    def start_period(self) -> int:
        """Gets the start_period of this LivePlayByPlayDrivesInner.


        :return: The start_period of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._start_period

    @start_period.setter
    def start_period(self, start_period: int):
        """Sets the start_period of this LivePlayByPlayDrivesInner.


        :param start_period: The start_period of this LivePlayByPlayDrivesInner.
        :type start_period: int
        """

        self._start_period = start_period

    @property
    def start_yards_to_goal(self) -> int:
        """Gets the start_yards_to_goal of this LivePlayByPlayDrivesInner.


        :return: The start_yards_to_goal of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._start_yards_to_goal

    @start_yards_to_goal.setter
    def start_yards_to_goal(self, start_yards_to_goal: int):
        """Sets the start_yards_to_goal of this LivePlayByPlayDrivesInner.


        :param start_yards_to_goal: The start_yards_to_goal of this LivePlayByPlayDrivesInner.
        :type start_yards_to_goal: int
        """

        self._start_yards_to_goal = start_yards_to_goal

    @property
    def yards(self) -> int:
        """Gets the yards of this LivePlayByPlayDrivesInner.


        :return: The yards of this LivePlayByPlayDrivesInner.
        :rtype: int
        """
        return self._yards

    @yards.setter
    def yards(self, yards: int):
        """Sets the yards of this LivePlayByPlayDrivesInner.


        :param yards: The yards of this LivePlayByPlayDrivesInner.
        :type yards: int
        """

        self._yards = yards
