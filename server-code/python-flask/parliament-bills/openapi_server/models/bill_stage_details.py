from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bill_stage_sitting import BillStageSitting
from openapi_server.models.committee import Committee
from openapi_server.models.house import House
from openapi_server import util

from openapi_server.models.bill_stage_sitting import BillStageSitting  # noqa: E501
from openapi_server.models.committee import Committee  # noqa: E501
from openapi_server.models.house import House  # noqa: E501

class BillStageDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, abbreviation=None, committee=None, description=None, house=None, id=None, last_update=None, next_stage_bill_stage_id=None, previous_stage_bill_stage_id=None, session_id=None, sort_order=None, stage_id=None, stage_sittings=None):  # noqa: E501
        """BillStageDetails - a model defined in OpenAPI

        :param abbreviation: The abbreviation of this BillStageDetails.  # noqa: E501
        :type abbreviation: str
        :param committee: The committee of this BillStageDetails.  # noqa: E501
        :type committee: Committee
        :param description: The description of this BillStageDetails.  # noqa: E501
        :type description: str
        :param house: The house of this BillStageDetails.  # noqa: E501
        :type house: House
        :param id: The id of this BillStageDetails.  # noqa: E501
        :type id: int
        :param last_update: The last_update of this BillStageDetails.  # noqa: E501
        :type last_update: datetime
        :param next_stage_bill_stage_id: The next_stage_bill_stage_id of this BillStageDetails.  # noqa: E501
        :type next_stage_bill_stage_id: int
        :param previous_stage_bill_stage_id: The previous_stage_bill_stage_id of this BillStageDetails.  # noqa: E501
        :type previous_stage_bill_stage_id: int
        :param session_id: The session_id of this BillStageDetails.  # noqa: E501
        :type session_id: int
        :param sort_order: The sort_order of this BillStageDetails.  # noqa: E501
        :type sort_order: int
        :param stage_id: The stage_id of this BillStageDetails.  # noqa: E501
        :type stage_id: int
        :param stage_sittings: The stage_sittings of this BillStageDetails.  # noqa: E501
        :type stage_sittings: List[BillStageSitting]
        """
        self.openapi_types = {
            'abbreviation': str,
            'committee': Committee,
            'description': str,
            'house': House,
            'id': int,
            'last_update': datetime,
            'next_stage_bill_stage_id': int,
            'previous_stage_bill_stage_id': int,
            'session_id': int,
            'sort_order': int,
            'stage_id': int,
            'stage_sittings': List[BillStageSitting]
        }

        self.attribute_map = {
            'abbreviation': 'abbreviation',
            'committee': 'committee',
            'description': 'description',
            'house': 'house',
            'id': 'id',
            'last_update': 'lastUpdate',
            'next_stage_bill_stage_id': 'nextStageBillStageId',
            'previous_stage_bill_stage_id': 'previousStageBillStageId',
            'session_id': 'sessionId',
            'sort_order': 'sortOrder',
            'stage_id': 'stageId',
            'stage_sittings': 'stageSittings'
        }

        self._abbreviation = abbreviation
        self._committee = committee
        self._description = description
        self._house = house
        self._id = id
        self._last_update = last_update
        self._next_stage_bill_stage_id = next_stage_bill_stage_id
        self._previous_stage_bill_stage_id = previous_stage_bill_stage_id
        self._session_id = session_id
        self._sort_order = sort_order
        self._stage_id = stage_id
        self._stage_sittings = stage_sittings

    @classmethod
    def from_dict(cls, dikt) -> 'BillStageDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BillStageDetails of this BillStageDetails.  # noqa: E501
        :rtype: BillStageDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def abbreviation(self) -> str:
        """Gets the abbreviation of this BillStageDetails.


        :return: The abbreviation of this BillStageDetails.
        :rtype: str
        """
        return self._abbreviation

    @abbreviation.setter
    def abbreviation(self, abbreviation: str):
        """Sets the abbreviation of this BillStageDetails.


        :param abbreviation: The abbreviation of this BillStageDetails.
        :type abbreviation: str
        """

        self._abbreviation = abbreviation

    @property
    def committee(self) -> Committee:
        """Gets the committee of this BillStageDetails.


        :return: The committee of this BillStageDetails.
        :rtype: Committee
        """
        return self._committee

    @committee.setter
    def committee(self, committee: Committee):
        """Sets the committee of this BillStageDetails.


        :param committee: The committee of this BillStageDetails.
        :type committee: Committee
        """

        self._committee = committee

    @property
    def description(self) -> str:
        """Gets the description of this BillStageDetails.


        :return: The description of this BillStageDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this BillStageDetails.


        :param description: The description of this BillStageDetails.
        :type description: str
        """

        self._description = description

    @property
    def house(self) -> House:
        """Gets the house of this BillStageDetails.


        :return: The house of this BillStageDetails.
        :rtype: House
        """
        return self._house

    @house.setter
    def house(self, house: House):
        """Sets the house of this BillStageDetails.


        :param house: The house of this BillStageDetails.
        :type house: House
        """

        self._house = house

    @property
    def id(self) -> int:
        """Gets the id of this BillStageDetails.


        :return: The id of this BillStageDetails.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this BillStageDetails.


        :param id: The id of this BillStageDetails.
        :type id: int
        """

        self._id = id

    @property
    def last_update(self) -> datetime:
        """Gets the last_update of this BillStageDetails.


        :return: The last_update of this BillStageDetails.
        :rtype: datetime
        """
        return self._last_update

    @last_update.setter
    def last_update(self, last_update: datetime):
        """Sets the last_update of this BillStageDetails.


        :param last_update: The last_update of this BillStageDetails.
        :type last_update: datetime
        """

        self._last_update = last_update

    @property
    def next_stage_bill_stage_id(self) -> int:
        """Gets the next_stage_bill_stage_id of this BillStageDetails.


        :return: The next_stage_bill_stage_id of this BillStageDetails.
        :rtype: int
        """
        return self._next_stage_bill_stage_id

    @next_stage_bill_stage_id.setter
    def next_stage_bill_stage_id(self, next_stage_bill_stage_id: int):
        """Sets the next_stage_bill_stage_id of this BillStageDetails.


        :param next_stage_bill_stage_id: The next_stage_bill_stage_id of this BillStageDetails.
        :type next_stage_bill_stage_id: int
        """

        self._next_stage_bill_stage_id = next_stage_bill_stage_id

    @property
    def previous_stage_bill_stage_id(self) -> int:
        """Gets the previous_stage_bill_stage_id of this BillStageDetails.


        :return: The previous_stage_bill_stage_id of this BillStageDetails.
        :rtype: int
        """
        return self._previous_stage_bill_stage_id

    @previous_stage_bill_stage_id.setter
    def previous_stage_bill_stage_id(self, previous_stage_bill_stage_id: int):
        """Sets the previous_stage_bill_stage_id of this BillStageDetails.


        :param previous_stage_bill_stage_id: The previous_stage_bill_stage_id of this BillStageDetails.
        :type previous_stage_bill_stage_id: int
        """

        self._previous_stage_bill_stage_id = previous_stage_bill_stage_id

    @property
    def session_id(self) -> int:
        """Gets the session_id of this BillStageDetails.


        :return: The session_id of this BillStageDetails.
        :rtype: int
        """
        return self._session_id

    @session_id.setter
    def session_id(self, session_id: int):
        """Sets the session_id of this BillStageDetails.


        :param session_id: The session_id of this BillStageDetails.
        :type session_id: int
        """

        self._session_id = session_id

    @property
    def sort_order(self) -> int:
        """Gets the sort_order of this BillStageDetails.


        :return: The sort_order of this BillStageDetails.
        :rtype: int
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order: int):
        """Sets the sort_order of this BillStageDetails.


        :param sort_order: The sort_order of this BillStageDetails.
        :type sort_order: int
        """

        self._sort_order = sort_order

    @property
    def stage_id(self) -> int:
        """Gets the stage_id of this BillStageDetails.


        :return: The stage_id of this BillStageDetails.
        :rtype: int
        """
        return self._stage_id

    @stage_id.setter
    def stage_id(self, stage_id: int):
        """Sets the stage_id of this BillStageDetails.


        :param stage_id: The stage_id of this BillStageDetails.
        :type stage_id: int
        """

        self._stage_id = stage_id

    @property
    def stage_sittings(self) -> List[BillStageSitting]:
        """Gets the stage_sittings of this BillStageDetails.


        :return: The stage_sittings of this BillStageDetails.
        :rtype: List[BillStageSitting]
        """
        return self._stage_sittings

    @stage_sittings.setter
    def stage_sittings(self, stage_sittings: List[BillStageSitting]):
        """Sets the stage_sittings of this BillStageDetails.


        :param stage_sittings: The stage_sittings of this BillStageDetails.
        :type stage_sittings: List[BillStageSitting]
        """

        self._stage_sittings = stage_sittings