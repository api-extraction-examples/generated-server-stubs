from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PredictedPoints(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, predicted_points=None, yard_line=None):  # noqa: E501
        """PredictedPoints - a model defined in OpenAPI

        :param predicted_points: The predicted_points of this PredictedPoints.  # noqa: E501
        :type predicted_points: float
        :param yard_line: The yard_line of this PredictedPoints.  # noqa: E501
        :type yard_line: int
        """
        self.openapi_types = {
            'predicted_points': float,
            'yard_line': int
        }

        self.attribute_map = {
            'predicted_points': 'predictedPoints',
            'yard_line': 'yardLine'
        }

        self._predicted_points = predicted_points
        self._yard_line = yard_line

    @classmethod
    def from_dict(cls, dikt) -> 'PredictedPoints':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PredictedPoints of this PredictedPoints.  # noqa: E501
        :rtype: PredictedPoints
        """
        return util.deserialize_model(dikt, cls)

    @property
    def predicted_points(self) -> float:
        """Gets the predicted_points of this PredictedPoints.


        :return: The predicted_points of this PredictedPoints.
        :rtype: float
        """
        return self._predicted_points

    @predicted_points.setter
    def predicted_points(self, predicted_points: float):
        """Sets the predicted_points of this PredictedPoints.


        :param predicted_points: The predicted_points of this PredictedPoints.
        :type predicted_points: float
        """

        self._predicted_points = predicted_points

    @property
    def yard_line(self) -> int:
        """Gets the yard_line of this PredictedPoints.


        :return: The yard_line of this PredictedPoints.
        :rtype: int
        """
        return self._yard_line

    @yard_line.setter
    def yard_line(self, yard_line: int):
        """Sets the yard_line of this PredictedPoints.


        :param yard_line: The yard_line of this PredictedPoints.
        :type yard_line: int
        """

        self._yard_line = yard_line