from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.dashboard_gadget import DashboardGadget
from openapi_server import util

from openapi_server.models.dashboard_gadget import DashboardGadget  # noqa: E501

class DashboardGadgetResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gadgets=None):  # noqa: E501
        """DashboardGadgetResponse - a model defined in OpenAPI

        :param gadgets: The gadgets of this DashboardGadgetResponse.  # noqa: E501
        :type gadgets: List[DashboardGadget]
        """
        self.openapi_types = {
            'gadgets': List[DashboardGadget]
        }

        self.attribute_map = {
            'gadgets': 'gadgets'
        }

        self._gadgets = gadgets

    @classmethod
    def from_dict(cls, dikt) -> 'DashboardGadgetResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DashboardGadgetResponse of this DashboardGadgetResponse.  # noqa: E501
        :rtype: DashboardGadgetResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gadgets(self) -> List[DashboardGadget]:
        """Gets the gadgets of this DashboardGadgetResponse.

        The list of gadgets.  # noqa: E501

        :return: The gadgets of this DashboardGadgetResponse.
        :rtype: List[DashboardGadget]
        """
        return self._gadgets

    @gadgets.setter
    def gadgets(self, gadgets: List[DashboardGadget]):
        """Sets the gadgets of this DashboardGadgetResponse.

        The list of gadgets.  # noqa: E501

        :param gadgets: The gadgets of this DashboardGadgetResponse.
        :type gadgets: List[DashboardGadget]
        """
        if gadgets is None:
            raise ValueError("Invalid value for `gadgets`, must not be `None`")  # noqa: E501

        self._gadgets = gadgets
