from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BillStageSitting(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bill_id=None, bill_stage_id=None, _date=None, id=None, stage_id=None):  # noqa: E501
        """BillStageSitting - a model defined in OpenAPI

        :param bill_id: The bill_id of this BillStageSitting.  # noqa: E501
        :type bill_id: int
        :param bill_stage_id: The bill_stage_id of this BillStageSitting.  # noqa: E501
        :type bill_stage_id: int
        :param _date: The _date of this BillStageSitting.  # noqa: E501
        :type _date: datetime
        :param id: The id of this BillStageSitting.  # noqa: E501
        :type id: int
        :param stage_id: The stage_id of this BillStageSitting.  # noqa: E501
        :type stage_id: int
        """
        self.openapi_types = {
            'bill_id': int,
            'bill_stage_id': int,
            '_date': datetime,
            'id': int,
            'stage_id': int
        }

        self.attribute_map = {
            'bill_id': 'billId',
            'bill_stage_id': 'billStageId',
            '_date': 'date',
            'id': 'id',
            'stage_id': 'stageId'
        }

        self._bill_id = bill_id
        self._bill_stage_id = bill_stage_id
        self.__date = _date
        self._id = id
        self._stage_id = stage_id

    @classmethod
    def from_dict(cls, dikt) -> 'BillStageSitting':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BillStageSitting of this BillStageSitting.  # noqa: E501
        :rtype: BillStageSitting
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bill_id(self) -> int:
        """Gets the bill_id of this BillStageSitting.


        :return: The bill_id of this BillStageSitting.
        :rtype: int
        """
        return self._bill_id

    @bill_id.setter
    def bill_id(self, bill_id: int):
        """Sets the bill_id of this BillStageSitting.


        :param bill_id: The bill_id of this BillStageSitting.
        :type bill_id: int
        """

        self._bill_id = bill_id

    @property
    def bill_stage_id(self) -> int:
        """Gets the bill_stage_id of this BillStageSitting.


        :return: The bill_stage_id of this BillStageSitting.
        :rtype: int
        """
        return self._bill_stage_id

    @bill_stage_id.setter
    def bill_stage_id(self, bill_stage_id: int):
        """Sets the bill_stage_id of this BillStageSitting.


        :param bill_stage_id: The bill_stage_id of this BillStageSitting.
        :type bill_stage_id: int
        """

        self._bill_stage_id = bill_stage_id

    @property
    def _date(self) -> datetime:
        """Gets the _date of this BillStageSitting.


        :return: The _date of this BillStageSitting.
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date: datetime):
        """Sets the _date of this BillStageSitting.


        :param _date: The _date of this BillStageSitting.
        :type _date: datetime
        """

        self.__date = _date

    @property
    def id(self) -> int:
        """Gets the id of this BillStageSitting.


        :return: The id of this BillStageSitting.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this BillStageSitting.


        :param id: The id of this BillStageSitting.
        :type id: int
        """

        self._id = id

    @property
    def stage_id(self) -> int:
        """Gets the stage_id of this BillStageSitting.


        :return: The stage_id of this BillStageSitting.
        :rtype: int
        """
        return self._stage_id

    @stage_id.setter
    def stage_id(self, stage_id: int):
        """Sets the stage_id of this BillStageSitting.


        :param stage_id: The stage_id of this BillStageSitting.
        :type stage_id: int
        """

        self._stage_id = stage_id
