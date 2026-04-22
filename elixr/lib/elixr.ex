defmodule Elixr do
  def greeting do
    System.get_env("GREETING") || "Hello, World!"
  end
end
